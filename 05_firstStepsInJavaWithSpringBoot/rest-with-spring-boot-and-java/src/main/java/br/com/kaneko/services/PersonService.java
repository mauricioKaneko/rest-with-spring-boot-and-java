package br.com.kaneko.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.kaneko.model.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	
	public List<Person> findAll(){
	
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	
	public Person findByID(String id) {
		logger.info("Finding one person");
		
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Mauricio");
		person.setLastName("Kaneko");
		person.setAddress("Rua A");
		person.setGender("Male");
		
		return person;
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Mauricio" +i);
		person.setLastName("Kaneko"+i);
		person.setAddress("Rua A"+i);
		person.setGender("Male"+i);

		return person;
	}
	
}
