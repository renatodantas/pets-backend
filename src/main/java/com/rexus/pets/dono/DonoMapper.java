package com.rexus.pets.dono;

public interface DonoMapper {

	public static DonoDto to(Dono dono) {
		return new DonoDto(dono.getId(), dono.getNome(), dono.isAtivo());
	}
	
	public static Dono to(DonoDto dto) {
		return new Dono(dto.getId(), dto.getNome(), dto.isAtivo());
	}
}
