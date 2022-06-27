package ro.fasttrackit.homework7.restaurantapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.homework7.restaurantapp.domain.City;


@Repository
public interface CitiesRepository extends JpaRepository<City, Long> {
  boolean existsByCity(String city);
}
