package com.rexus.pets.pet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PetService {

	private final PetRepository petRepository;
	private final PetMapper petMapper;
	
	public List<PetDto> findAll() {
		Iterable<Pet> pets = petRepository.findAll();
		List<PetDto> dtos = new ArrayList<>();
		pets.forEach(pet -> dtos.add(petMapper.converter(pet)));
		return dtos;
	}
}
