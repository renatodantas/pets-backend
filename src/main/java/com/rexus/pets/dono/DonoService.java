package com.rexus.pets.dono;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rexus.pets.AbstractService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor 
public class DonoService extends AbstractService<Dono, Integer> {

	private final DonoRepository donoRepository;
	
	@Override
	protected JpaRepository<Dono, Integer> getRepository() {
		return donoRepository;
	}
	
}
