package com.rexus.pets.pet;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PetMapper {

	PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="nome", target="nome")
	})
	PetDto to(Pet pet);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="nome", target="nome")
	})
	Pet to(PetDto dto);
}
