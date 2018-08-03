package com.rexus.pets.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    
    private String nome;

    @Enumerated(EnumType.STRING)
    private PetType tipo;

	public Pet(String nome, PetType tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
}