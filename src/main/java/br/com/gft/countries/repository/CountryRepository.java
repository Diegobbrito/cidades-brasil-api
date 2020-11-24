package br.com.gft.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
