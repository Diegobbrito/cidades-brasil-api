package br.com.gft.cities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.cities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
