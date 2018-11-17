package com.rexus.pets.dono;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "dono") 
@Getter @Setter 
@ToString 
@EqualsAndHashCode(of = "id") 
@NoArgsConstructor 
public class Dono {

    @Id 
    @GeneratedValue 
    private Integer id;
    
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

	public Dono(String nome) {
		this.nome = nome;
	}
}