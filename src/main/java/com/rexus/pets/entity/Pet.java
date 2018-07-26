package com.rexus.pets.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pet")
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Pet {

    @Id
    private Integer id;
    
    private String nome;

    @Enumerated(EnumType.STRING)
    private PetType tipo;

}