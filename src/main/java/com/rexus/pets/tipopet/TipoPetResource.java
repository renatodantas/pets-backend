package com.rexus.pets.tipopet;

import java.util.List;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/tipos-pet")
@AllArgsConstructor
public class TipoPetResource {

	private final TipoPetService tipoPetService;
	
	@GetMapping
	public List<TipoPetDto> getPets(@RequestParam MultiValueMap<String, String> queryParams) {
		System.out.println("page: " + queryParams.getFirst("page"));
		System.out.println("order: " + queryParams.getFirst("order"));
		return tipoPetService.findAll();
	}
}
