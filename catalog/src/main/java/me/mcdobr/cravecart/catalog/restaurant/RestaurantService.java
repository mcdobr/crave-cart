package me.mcdobr.cravecart.catalog.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Transactional(readOnly = true)
    public List<RestaurantDto> findAll() {
        return restaurantRepository.findAll()
                .stream()
                .map(RestaurantService::mapEntityToDto)
                .toList();
    }

    @Transactional(readOnly = true)
    public Optional<RestaurantDto> findById(Long restaurantId) {
        return restaurantRepository.findById(restaurantId)
                .map(RestaurantService::mapEntityToDto);
    }

    @Transactional
    public RestaurantDto create(RestaurantCreationRequestDto restaurantCreationRequestDto) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurantCreationRequestDto.name());

        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        return mapEntityToDto(savedRestaurant);
    }

    private static RestaurantDto mapEntityToDto(Restaurant restaurant) {
        return new RestaurantDto(restaurant.getId(), restaurant.getName());
    }
}
