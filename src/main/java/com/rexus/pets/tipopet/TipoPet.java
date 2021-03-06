package com.rexus.pets.tipopet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tipo_pet")
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class TipoPet {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    
    @Column(name = "descricao", nullable = false, unique = true)
    private String descricao;
    
    /**
     * Construtor padrão para o Spring Data
     * 
     * @param id do tipo do pet
     */
    public TipoPet(Integer id) {
        this.id = id;
    }

}