package me.mircea.cravecart.deliverytracking.orderlocation;

import java.time.Instant;

public record OrderLocationMessage(
        Long orderId,
        Long driverId,
        double latitude,
        double longitude,
        Instant moment
) {
}
