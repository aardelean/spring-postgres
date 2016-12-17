package home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import home.persons.repositories.EntityEventHandler;
import home.persons.entities.Person;
import home.persons.repositories.PersonRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = PersonRepository.class)
public class ApiPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPostgresApplication.class, args);
	}
	@Component
	public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {
		@Override
		public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
			config.withEntityLookup().
					forRepository(PersonRepository.class, Person::getApiKey, PersonRepository::findByApiKey);
		}
	}

	@Bean
	public EntityEventHandler entityEventHandler() {
		return new EntityEventHandler();
	}

}
