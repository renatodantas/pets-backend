package com.rexus.pets.tipopet;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class TipoPetDto {

    private Integer id;
    private String descricao;

}
