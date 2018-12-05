package com.rexus.pets.tipopet;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TipoPetMapper {

	TipoPetMapper INSTANCE = Mappers.getMapper(TipoPetMapper.class);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="descricao", target="descricao")
	})
	TipoPetDto to(TipoPet pet);
	
	@Mappings({
		@Mapping(source="id", target="id"),
		@Mapping(source="descricao", target="descricao")
	})
	TipoPet to(TipoPetDto pet);
}
