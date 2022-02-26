package com.prash.springcloudfunction.functions;

import com.prash.springcloudfunction.dto.DishDto;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetDishes {
    //this should come from database later on
    private List<DishDto> getDishes() {
        return Arrays.asList(
            new DishDto("Aalo Subzi", Arrays.asList("Aalo", "Tomato"))
            , new DishDto("Paneer Butter Masala", Arrays.asList("Paneer", "Cardamom", "Onion", "Tomato", "Oil", "Sugar", "Salt", "Cashew nut", "Red chilli",
                "Garam masala", "Coriander", "Cream", "Ginger", "Garlic", "Fenugreek"))
            , new DishDto("Samosa", Arrays.asList("Aalo", "Wheat flour"))
        );
    }

    @Bean
    public Function<String, List<DishDto>> getDish() {
        return value -> {
            System.out.println("Received request for dish -" + value);
            return getDishes().stream().filter(dish -> dish.getName().toLowerCase().contains(value.toLowerCase())
            || dish.getIngredients().stream().anyMatch(ingredient -> ingredient.toLowerCase().contains(value.toLowerCase()))).collect(Collectors.toList());
        };
    }
}
