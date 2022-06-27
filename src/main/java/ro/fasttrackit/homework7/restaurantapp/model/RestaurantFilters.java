package ro.fasttrackit.homework7.restaurantapp.model;

import lombok.Value;

import java.util.List;

@Value
public class RestaurantFilters {
    String city;
    List<Integer> stars;
}
