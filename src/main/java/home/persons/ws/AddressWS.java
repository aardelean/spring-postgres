package home.persons.ws;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.hateoas.ResourceSupport;

@Getter
@Setter
@Builder
public class AddressWS extends ResourceSupport {
	private String apiKey;
	private String country;
	private String city;

}
