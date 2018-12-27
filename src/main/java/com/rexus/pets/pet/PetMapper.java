package com.rexus.pets.pet;

import com.rexus.pets.dono.DonoMapper;
import com.rexus.pets.tipopet.TipoPetMapper;

public interface PetMapper {

	public static PetDto to(Pet pet) {
		return new PetDto(
				pet.getId(), 
				pet.getNome(),
				TipoPetMapper.to(pet.getTipo()),
				DonoMapper.to(pet.getDono()));
	}

	public static Pet to(PetDto dto) {
		return new Pet(
				dto.getId(), 
				dto.getNome(),
				TipoPetMapper.to(dto.getTipo()),
				DonoMapper.to(dto.getDono()));
	}
}
