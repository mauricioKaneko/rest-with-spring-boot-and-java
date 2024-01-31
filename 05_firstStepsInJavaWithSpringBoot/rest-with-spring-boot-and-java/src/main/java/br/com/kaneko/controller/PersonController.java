package br.com.kaneko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kaneko.model.Person;
import br.com.kaneko.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public List<Person> findByAll() {
		return personService.findAll();
	}

	@GetMapping("/{id}")
	public Person findById(@PathVariable(value="id") String id) {
		return personService.findByID(id);
	}
	
	
	
}
