package com.rexus.pets;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.rexus.pets.entity.Pet;

@Component
public class RepositoryConfigurerAdapter extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		configurarExposicaoId(config);
		configurarCors(config);
	}

	private void configurarExposicaoId(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Pet.class);
	}

	private void configurarCors(RepositoryRestConfiguration config) {
		config.getCorsRegistry()
			.addMapping("/pets/**")
			.allowedOrigins("http://localhost:3000")
			.allowedMethods(
					HttpMethod.GET.toString(),
					HttpMethod.POST.toString(),
					HttpMethod.PUT.toString(),
					HttpMethod.DELETE.toString());
	}
}
