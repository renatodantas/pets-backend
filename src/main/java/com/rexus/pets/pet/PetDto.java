package com.rexus.pets.pet;

import com.rexus.pets.dono.DonoDto;
import com.rexus.pets.tipopet.TipoPetDto;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(of="id")
public class PetDto {

    private Integer id;
    private String nome;
    private TipoPetDto tipo;
    private DonoDto dono;

}
