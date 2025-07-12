package me.mircea.cravecart.deliverytracking.orderlocation;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

/**
 * Publisher of order location messages. To be consumed by many possible consumers:
 * - a server sent event publisher (for web clients)
 * - a push notification publisher (for mobile apps)
 * - a websocket publisher (possible alternative for the server sent event one)
 */
@Component
public class OrderLocationPublisher {
    private final Sinks.Many<OrderLocationMessage> sink = Sinks.many()
            .multicast()
            .onBackpressureBuffer();


    public void publish(OrderLocationMessage orderLocationMessage) {
        sink.tryEmitNext(orderLocationMessage);
    }

    public Flux<OrderLocationMessage> getFlux() {
        return sink.asFlux();
    }
}
