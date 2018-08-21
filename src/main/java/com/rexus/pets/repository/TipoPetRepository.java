package com.rexus.pets.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rexus.pets.entity.TipoPet;

@RepositoryRestResource(path = "/tipos-pet", itemResourceRel = "tipoPet", collectionResourceRel = "tiposPet")
public interface TipoPetRepository extends PagingAndSortingRepository<TipoPet, Integer> {

}
