package com.rexus.pets.tipopet;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPetRepository extends PagingAndSortingRepository<TipoPet, Integer> {

}
