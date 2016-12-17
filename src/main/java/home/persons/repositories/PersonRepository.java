package home.persons.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import home.persons.ws.PersonListProjection;
import home.persons.entities.Person;

@RepositoryRestResource(excerptProjection = PersonListProjection.class)
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
	Person findByApiKey(String apiKey);
}
