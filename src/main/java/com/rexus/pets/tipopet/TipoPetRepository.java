package com.rexus.pets.tipopet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPetRepository extends JpaRepository<TipoPet, Integer> {

}
