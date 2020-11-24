package br.com.gft.states.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.states.State;
import br.com.gft.states.repository.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {
	
	private final StateRepository repository;
	
	public StateResource(final StateRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<State> states(){
		return repository.findAll();
	}

}
