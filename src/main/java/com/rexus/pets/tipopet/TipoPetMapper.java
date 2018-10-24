package com.rexus.pets.tipopet;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TipoPetMapper {

	TipoPetMapper INSTANCE = Mappers.getMapper(TipoPetMapper.class);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="descricao", target="descricao")
	})
	TipoPetDto converter(TipoPet pet);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="descricao", target="descricao")
	})
	TipoPet converter(TipoPetDto pet);
}
