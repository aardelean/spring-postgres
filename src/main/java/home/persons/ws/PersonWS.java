package home.persons.ws;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.hateoas.ResourceSupport;

@Getter
@Setter
@Builder
public class PersonWS extends ResourceSupport {
	private String apiKey;
	private String firstName;
	private String lastName;
	private List<AddressWS> addressWS;
}
