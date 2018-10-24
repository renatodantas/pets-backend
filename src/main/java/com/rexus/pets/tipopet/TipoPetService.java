package com.rexus.pets.tipopet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TipoPetService {

	private final TipoPetRepository tipoPetRepository;
	private final TipoPetMapper tipoPetMapper;
	
	public List<TipoPetDto> findAll() {
		Iterable<TipoPet> pets = tipoPetRepository.findAll();
		List<TipoPetDto> dtos = new ArrayList<>();
		pets.forEach(pet -> dtos.add(tipoPetMapper.converter(pet)));
		return dtos;
	}
}
