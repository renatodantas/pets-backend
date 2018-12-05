package com.rexus.pets.dono;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
interface DonoMapper {

	DonoMapper INSTANCE = Mappers.getMapper(DonoMapper.class);

	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="nome", target="nome")
	})
	DonoDto to(Dono pet);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="nome", target="nome"),
		@Mapping(target="ativo", ignore=true)
	})
	Dono to(DonoDto pet);
}
