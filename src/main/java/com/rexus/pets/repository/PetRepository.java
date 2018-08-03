package com.rexus.pets.repository;

import org.springframework.data.repository.CrudRepository;

import com.rexus.pets.entity.Pet;


public interface PetRepository extends CrudRepository<Pet, Integer> {

}
