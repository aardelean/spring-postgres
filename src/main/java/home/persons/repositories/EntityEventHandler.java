package home.persons.repositories;

import java.util.UUID;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import home.persons.entities.Address;
import home.persons.entities.Person;

@RepositoryEventHandler
public class EntityEventHandler {
	@HandleBeforeCreate
	public void handlePersonSave(Person p) {
		p.setApiKey(UUID.randomUUID().toString());
	}

	@HandleBeforeCreate
	public void handleAddressSave(Address p) {
		p.setApiKey(UUID.randomUUID().toString());
	}
}
