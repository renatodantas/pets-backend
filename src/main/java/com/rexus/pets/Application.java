package com.rexus.pets;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rexus.pets.dono.Dono;
import com.rexus.pets.dono.DonoRepository;
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
	private DonoRepository donoRepository;
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private TipoPetRepository tipoPetRepository;
	
	@PostConstruct
	public void init() {
		val donoRenato   = donoRepository.save(new Dono("Renato"));
		val donoMarcelo  = donoRepository.save(new Dono("Marcelo"));
		val donoHenrique = donoRepository.save(new Dono("Henrique"));
		
		val tipoCachorro = tipoPetRepository.save(new TipoPet(1, "Cachorro"));
		val tipoGato     = tipoPetRepository.save(new TipoPet(2, "Gato"));
		val tipoPassaro  = tipoPetRepository.save(new TipoPet(3, "Pássaro"));
		
		petRepository.save(new Pet("Sarugo",    tipoCachorro, donoRenato));
		petRepository.save(new Pet("Maneta",    tipoGato, 	  donoRenato));
		petRepository.save(new Pet("Lôro",      tipoPassaro,  donoHenrique));
		petRepository.save(new Pet("Calopsita", tipoPassaro,  donoHenrique));
		petRepository.save(new Pet("Capiroto",  tipoGato,     donoMarcelo));
		petRepository.save(new Pet("Salém",     tipoGato,     donoMarcelo));
	}
	
}
