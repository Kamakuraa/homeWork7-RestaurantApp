package ro.fasttrackit.homework7.restaurantapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import ro.fasttrackit.homework7.restaurantapp.domain.City;
import ro.fasttrackit.homework7.restaurantapp.domain.Restaurant;
import ro.fasttrackit.homework7.restaurantapp.repository.CitiesRepository;
import ro.fasttrackit.homework7.restaurantapp.repository.RestaurantRepository;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class HomeWork7RestaurantAppApplication {

  public static void main(String[] args) {
    SpringApplication.run (HomeWork7RestaurantAppApplication.class, args);
  }

  @Profile("Portugalia")
  @Bean
  CommandLineRunner atStartUp(RestaurantRepository repository, CitiesRepository citiesRepository) {
    citiesRepository.saveAll (List.of (new City ("Bucuresti"),
      new City ("Porto")));
    return args -> {
      repository.saveAll (List.of (
        new Restaurant ("White Horse", 2, "Bucuresti", LocalDate.now ()),
        new Restaurant ("Oficina des Rissois", 5, "Porto", LocalDate.now ())
      ));
    };
  }


  @Profile("Romania")
  @Bean
  CommandLineRunner atStartup1(RestaurantRepository repository, CitiesRepository citiesRepository) {
    citiesRepository.saveAll(List.of(new City("Bucuresti"), new City("Timisoara")));
    return args -> {
      repository.saveAll(List.of(
        new Restaurant("OSHO", 4, "Bcuresti", LocalDate.now()),
        new Restaurant("FishHouse", 5, "Timisoara", LocalDate.now())
      ));
    };
  }
}
