package com.rexus.pets;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rexus.pets.pet.Pet;
import com.rexus.pets.pet.PetRepository;
import com.rexus.pets.tipopet.TipoPet;
import com.rexus.pets.tipopet.TipoPetRepository;

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
		petRepository.save(new Pet("fofinho", tipoPapagaio));
		petRepository.save(new Pet("capiroto", tipoGato));
		petRepository.save(new Pet("luck", tipoCachorro));
	}
	
}
