package me.mcdobr.cravecart.catalog.restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class RestaurantServiceTest {
    @Mock
    private RestaurantRepository restaurantRepository;

    private RestaurantService restaurantService;

    @BeforeEach
    void setUp() {
        restaurantService = new RestaurantService(restaurantRepository);
    }

    @Test
    void shouldFindAll() {
        restaurantService.findAll();

        then(restaurantRepository).should().findAll();
    }

    @Test
    void shouldFindById() {
        long restaurantId = 10L;
        restaurantService.findById(restaurantId);

        then(restaurantRepository).should().findById(restaurantId);
    }

    @Test
    void shouldCreate() {
        given(restaurantRepository.save(any(Restaurant.class))).willAnswer(AdditionalAnswers.returnsFirstArg());

        restaurantService.create(new RestaurantCreationRequestDto("1000", "Abis"));

        then(restaurantRepository).should().save(any(Restaurant.class));
    }
}