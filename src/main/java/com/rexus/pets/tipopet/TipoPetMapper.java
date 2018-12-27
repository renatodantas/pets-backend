package com.rexus.pets.tipopet;

public interface TipoPetMapper {

	public static TipoPetDto to(TipoPet tipo) {
		return new TipoPetDto(tipo.getId(), tipo.getDescricao());
	}
	
	public static TipoPet to(TipoPetDto dto) {
		return new TipoPet(dto.getId(), dto.getDescricao());
	}
}
