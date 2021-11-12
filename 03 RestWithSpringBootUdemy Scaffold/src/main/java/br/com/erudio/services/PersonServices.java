package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();

	public Person create(Person person) {
		return person;
	}

	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}

	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro");
		person.setLastName("Costa");
		person.setAdress("Uberlândia - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}

	public List<Person> findByAll() {

		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person nmae" + i);
		person.setLastName("Last Name" + i);
		person.setAdress("Some adress in Brazil" + i);
		person.setGender("Male" + i);
		return person;
	}
}
