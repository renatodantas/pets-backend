package com.rexus.pets.tipopet;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/tipos-pet", itemResourceRel = "tipoPet", collectionResourceRel = "tiposPet")
public interface TipoPetRepository extends PagingAndSortingRepository<TipoPet, Integer> {

}
