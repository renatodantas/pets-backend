package com.rexus.pets.pet;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/pets")
public class PetResource {

	private final PetService petService;
	
	@GetMapping
	public List<PetDto> getPets(@RequestParam MultiValueMap<String, String> queryParams) {
		log.info("page: " + queryParams.getFirst("page"));
		log.info("order: " + queryParams.getFirst("order"));
		
		val pets = petService.findAll();
		log.info("Pets encontrados: {}", pets.size());
		return pets.stream()
				.map(PetMapper::to)
				.collect(toList());
	}
}
