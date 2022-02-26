package com.prash.springcloudfunction.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishDto {
    private String name;
    private List<String> ingredients;
    //private List<String> suitableFor; //breakfast, lunch, dinner etc
    //add recommended portion size in grams
    //add nutritional information according to portion size
    //alternative ingredients to make this dish healthy (eg replace non-veg with veg alternatives)
}
