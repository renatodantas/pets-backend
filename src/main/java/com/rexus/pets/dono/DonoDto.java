package com.rexus.pets.dono;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(of = "id")
public class DonoDto {

    private Integer id;
    private String nome;
    private boolean ativo;

}
