package com.rexus.pets;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rexus.pets.entity.Pet;
import com.rexus.pets.entity.PetType;
import com.rexus.pets.repository.PetRepository;

@SpringBootApplication
public class Application {

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private PetRepository petRepository;
	
	@PostConstruct
	public void init() {
		petRepository.save(new Pet("Sarugo", PetType.CACHORRO));
		petRepository.save(new Pet("Maneta", PetType.GATO));
		petRepository.save(new Pet("Lôro", PetType.PAPAGAIO));
	}
}
