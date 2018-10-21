package com.rexus.pets.pet;

import java.util.List;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pets")
@AllArgsConstructor
public class PetResource {

	private final PetService petService;
	
	@GetMapping
	public List<PetDto> getPets(@RequestParam MultiValueMap<String, String> queryParams) {
		System.out.println("page: " + queryParams.getFirst("page"));
		System.out.println("order: " + queryParams.getFirst("order"));
		return petService.findAll();
	}
}
