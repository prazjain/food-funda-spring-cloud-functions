package com.prash.springcloudfunction;

import com.prash.springcloudfunction.dto.DishDto;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    private List<DishDto> getDishes() {
        return Arrays.asList(
            new DishDto("Aalo Subzi", Arrays.asList("Aalo", "Tomato"))
            , new DishDto("Paneer Butter Masala", Arrays.asList("Cardamom", "Onion", "Tomato", "Oil", "Sugar", "Salt", "Cashew nut", "Red chilli",
                "Garam masala", "Coriander", "Cream", "Ginger", "Garlic", "Fenugreek"))
            , new DishDto("Samosa", Arrays.asList("Aalo", "Wheat flour"))
        );
    }
}
