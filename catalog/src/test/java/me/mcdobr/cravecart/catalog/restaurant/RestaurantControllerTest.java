package me.mcdobr.cravecart.catalog.restaurant;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class RestaurantControllerTest {
    @MockBean
    private RestaurantService restaurantService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void shouldFindAll() throws Exception {
        mockMvc.perform(get("/api/v1/restaurants"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void shouldFindOneShouldReturnOk() throws Exception {
        RestaurantDto foundRestaurant = new RestaurantDto(10L, "name");
        given(restaurantService.findById(ArgumentMatchers.anyLong()))
                .willReturn(Optional.of(foundRestaurant));

        mockMvc.perform(get("/api/v1/restaurants/{restaurant-id}", foundRestaurant.id()))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void shouldReturnCreatedOnSuccessfulCreation() throws Exception {
        RestaurantCreationRequestDto vesuviusCreation = new RestaurantCreationRequestDto("1000", "Vesuvius");
        given(restaurantService.create(eq(vesuviusCreation)))
                .willReturn(new RestaurantDto(10L, vesuviusCreation.name()));

        mockMvc.perform(post("/api/v1/restaurants")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(vesuviusCreation)))
                .andExpect(status().isCreated())
                .andReturn();
    }

    private String asJsonString(final Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}