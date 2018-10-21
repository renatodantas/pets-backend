package com.rexus.pets.pet;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends PagingAndSortingRepository<Pet, Integer> {

}
