package ro.fasttrackit.homework7.restaurantapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
  @Id
  @GeneratedValue
  private Long id;

  private String city;

  public City(String city) {
    this.city = city;
  }
}
