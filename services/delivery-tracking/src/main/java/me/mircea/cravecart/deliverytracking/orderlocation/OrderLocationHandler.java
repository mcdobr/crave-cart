package me.mircea.cravecart.deliverytracking.orderlocation;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderLocationHandler implements WebSocketHandler {
    private final OrderLocationPublisher driverLocationPublisher;
    private final ObjectMapper objectMapper;

    @NotNull
    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session.receive()
                .map(WebSocketMessage::getPayloadAsText)
                .log("gps-data")
                .flatMap(rawMessage -> Mono.fromCallable(() -> objectMapper.readValue(rawMessage, OrderLocationMessage.class)))
                .doOnNext(driverLocationPublisher::publish)
                .onErrorContinue(((throwable, rawMessage) -> {
                    // if some messages are unparsable, drop and log them
                    log.warn("Failed to parse message: {}", rawMessage, throwable);
                }))
                .then();
    }
}
