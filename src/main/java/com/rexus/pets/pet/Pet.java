package com.rexus.pets.pet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rexus.pets.tipopet.TipoPet;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pet")
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Pet {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "tipo", referencedColumnName = "id", nullable = false)
    private TipoPet tipo;
    
	public Pet(String nome, TipoPet tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
}