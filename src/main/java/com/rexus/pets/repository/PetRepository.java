package com.rexus.pets.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rexus.pets.entity.Pet;

@RepositoryRestResource(path = "/pets", itemResourceRel = "pet", collectionResourceRel = "pets")
public interface PetRepository extends PagingAndSortingRepository<Pet, Integer> {

}
