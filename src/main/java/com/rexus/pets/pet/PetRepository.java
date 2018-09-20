package com.rexus.pets.pet;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(itemResourceRel = "pet", collectionResourceRel = "pets")
public interface PetRepository extends PagingAndSortingRepository<Pet, Integer> {

}
