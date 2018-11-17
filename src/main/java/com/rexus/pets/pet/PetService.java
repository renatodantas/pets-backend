package com.rexus.pets.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rexus.pets.AbstractService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PetService extends AbstractService<Pet, Integer> {

	private final PetRepository petRepository;
	
	@Override
	protected JpaRepository<Pet, Integer> getRepository() {
		return petRepository;
	}
}
