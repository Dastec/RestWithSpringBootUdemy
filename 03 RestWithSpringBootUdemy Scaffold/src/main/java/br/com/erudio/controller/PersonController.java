package br.com.erudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonServices services;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) // methodo = Default GET																									
	public List<Person> findByAll() {
		return services.findByAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) // methodo = Default GET																									
	public Person findById(@PathVariable("id") String id) {
		return services.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // methodo = Default GET																									
	public Person create(@RequestBody Person person) {
		return services.create(person);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // methodo = Default GET																									
	public Person update(@RequestBody Person person) {
		return services.update(person);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // methodo = Default GET																									
	public void delete(@PathVariable("id") String id) {
		services.delete(id);
	}


}
