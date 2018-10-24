package com.rexus.pets.tipopet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TipoPetService {

	private final TipoPetRepository tipoPetRepository;
	
	public List<TipoPetDto> findAll() {
		Iterable<TipoPet> it = tipoPetRepository.findAll();
		return StreamSupport
				.stream(it.spliterator(), false)
				.map(TipoPetMapper.INSTANCE::to)
				.collect(Collectors.toList());
	}
}
