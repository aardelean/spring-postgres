package home.persons.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import home.persons.entities.Address;

/**
 * Created by alex.ardelean on 24/11/2016.
 */
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
}
