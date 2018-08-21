package com.rexus.pets;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.rexus.pets.entity.Pet;
import com.rexus.pets.entity.TipoPet;

@Component
public class RepositoryConfigurerAdapter extends RepositoryRestConfigurerAdapter {
    
    private final Class<?>[] classesToExposeID = {
            Pet.class,
            TipoPet.class
    };
    
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    config.exposeIdsFor(classesToExposeID);
		configurarCors(config);
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
