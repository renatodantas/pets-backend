package com.rexus.pets.dono;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class DonoDto {

    private Integer id;
    private String nome;

}
