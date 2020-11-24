package br.com.gft.states.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.states.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
