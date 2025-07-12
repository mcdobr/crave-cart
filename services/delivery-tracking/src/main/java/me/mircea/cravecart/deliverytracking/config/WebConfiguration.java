package me.mircea.cravecart.deliverytracking.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.mircea.cravecart.deliverytracking.orderlocation.OrderLocationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class WebConfiguration {
    private static final int ORDER = -1;
    private final OrderLocationHandler orderLocationHandler;

    @Bean
    public SimpleUrlHandlerMapping webSocketHandlerMapping() {
        log.info("Registering WS handler on /ws/order-locations");
        return new SimpleUrlHandlerMapping(Map.ofEntries(
            Map.entry("/ws/order-locations", orderLocationHandler)
        ),
                ORDER
        );
    }

    @Bean
    public WebSocketHandlerAdapter webSocketHandlerAdapter() {
        return new WebSocketHandlerAdapter();
    }
}
