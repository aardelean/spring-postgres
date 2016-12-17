package home.persons.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Address extends AbstractEntity {
	@ManyToOne
	private Person person;
	private String street;
	private String city;
	private String country;
}
