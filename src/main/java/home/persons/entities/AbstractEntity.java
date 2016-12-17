package home.persons.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import home.persons.JsonBinaryType;
import home.persons.JsonStringType;

@Getter @Setter
@MappedSuperclass
@TypeDefs({
		@TypeDef(name = "json", typeClass = JsonStringType.class),
		@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class AbstractEntity {
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;
	@JsonIgnore
	private String apiKey;
	@CreationTimestamp
	@JsonIgnore
	private Date created;
	@UpdateTimestamp
	@JsonIgnore
	private Date lastModified;
}
