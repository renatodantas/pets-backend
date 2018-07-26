package com.rexus.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rexus.pets.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
