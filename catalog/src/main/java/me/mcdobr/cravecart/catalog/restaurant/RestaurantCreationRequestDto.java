package me.mcdobr.cravecart.catalog.restaurant;

public record RestaurantCreationRequestDto(
        String idempotencyKey,
        String name
) {
}
