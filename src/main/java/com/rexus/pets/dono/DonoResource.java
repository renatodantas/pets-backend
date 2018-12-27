package com.rexus.pets.dono;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/donos")
@AllArgsConstructor 
public class DonoResource {

	private final DonoService donoService;
	
	@GetMapping
	public List<DonoDto> getPets(@RequestParam MultiValueMap<String, String> queryParams) {
		log.info("page: " + queryParams.getFirst("page"));
		log.info("order: " + queryParams.getFirst("order"));

		val donos = donoService.findAll();
		log.info("Donos encontrados: {}", donos.size());
		return donos.stream()
				.map(DonoMapper::to)
				.collect(Collectors.toList());
	}
}
