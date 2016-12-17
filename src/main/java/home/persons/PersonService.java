package home.persons;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.persons.entities.Person;
import home.persons.repositories.PersonRepository;
import home.persons.ws.PersonFacade;
import home.persons.ws.PersonWS;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repository;
	@Autowired
	private PersonFacade facade;

	public PersonWS findByKey(String key) {
		return facade.toWS(repository.findByApiKey(key));
	}

	@PostConstruct
	public void insertSome() {
		Person person = new Person();
		person.setFirstName("test");
		person.setLastName("last");
		person.setApiKey(UUID.randomUUID().toString());
//		PersonDetails details = new PersonDetails();
//		details.setVotat(true);
		Map<String, String> attributes = new HashMap<>();
		attributes.put("ani", "valid");
		person.setDetails(attributes);
		repository.save(person);
	}
}
