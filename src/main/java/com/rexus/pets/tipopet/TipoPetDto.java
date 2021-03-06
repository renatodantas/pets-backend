package com.rexus.pets.tipopet;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(of = "id")
public class TipoPetDto {

    private Integer id;
    private String descricao;

}
