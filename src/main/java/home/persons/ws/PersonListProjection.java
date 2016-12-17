package home.persons.ws;

import org.springframework.data.rest.core.config.Projection;

import home.persons.entities.Person;

@Projection(name = "listProjection", types = { Person.class })
public interface PersonListProjection {
	String getFirstName();
	String getLastName();
	String getApiKey();
}
