package com.rexus.pets.tipopet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rexus.pets.AbstractService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TipoPetService extends AbstractService<TipoPet, Integer> {

	private final TipoPetRepository tipoPetRepository;
	
	@Override
	protected JpaRepository<TipoPet, Integer> getRepository() {
		return tipoPetRepository;
	}
}
