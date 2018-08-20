package com.rexus.pets;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rexus.pets.entity.Pet;
import com.rexus.pets.entity.TipoPet;
import com.rexus.pets.repository.PetRepository;
import com.rexus.pets.repository.TipoPetRepository;

import lombok.val;

@SpringBootApplication
public class Application {

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private TipoPetRepository tipoPetRepository;
	
	@PostConstruct
	public void init() {
		val tipoCachorro = tipoPetRepository.save(new TipoPet(1, "Cachorro"));
		val tipoGato     = tipoPetRepository.save(new TipoPet(2, "Gato"));
		val tipoPapagaio = tipoPetRepository.save(new TipoPet(3, "Papagaio"));
		
		petRepository.save(new Pet("Sarugo", tipoCachorro));
		petRepository.save(new Pet("Maneta", tipoGato));
		petRepository.save(new Pet("Lôro", tipoPapagaio));
	}
	
}
