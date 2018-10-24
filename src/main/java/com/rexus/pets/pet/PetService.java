package com.rexus.pets.pet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PetService {

	private final PetRepository petRepository;
	
	public List<PetDto> findAll() {
		Iterable<Pet> it = petRepository.findAll();
		return StreamSupport
				.stream(it.spliterator(), false)
				.map(PetMapper.INSTANCE::to)
				.collect(Collectors.toList());
	}
}
