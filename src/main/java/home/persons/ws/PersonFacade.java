package home.persons.ws;

import org.springframework.stereotype.Component;

import home.persons.entities.Person;

@Component
public class PersonFacade {

	public PersonWS toWS(Person person) {
		PersonWS personWS = PersonWS.builder()
				.apiKey(person.getApiKey())
				.firstName(person.getFirstName())
				.lastName(person.getLastName())
				.build();
		return personWS;
	}
}
