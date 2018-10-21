package com.rexus.pets.pet;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class PetDto {

    private Integer id;
    private String nome;

}
