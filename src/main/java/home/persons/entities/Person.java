package home.persons.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.Type;

@Getter @Setter
@Entity
public class Person extends AbstractEntity {
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "person")
	private List<Address> addresses;
	@Type(type = "jsonb")
	@Column(columnDefinition = "json")
	private Map<String, String> details;
}
