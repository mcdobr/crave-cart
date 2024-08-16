package me.mcdobr.cravecart.catalog.restaurant;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
@Slf4j
@Validated
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<RestaurantDto>> findAll() {
        return ResponseEntity.ok(restaurantService.findAll());
    }

    @GetMapping("/{restaurant-id}")
    public ResponseEntity<RestaurantDto> findOne(@PathVariable("restaurant-id") Long restaurantId) {
        return restaurantService.findById(restaurantId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RestaurantDto> create(RestaurantCreationRequestDto restaurantCreationRequestDto) {
        RestaurantDto createdRestaurant = restaurantService.create(restaurantCreationRequestDto);
        return ResponseEntity.created(URI.create("/placeholder"))
                .body(createdRestaurant);
    }
}
