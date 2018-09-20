package com.rexus.pets;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.rexus.pets.pet.Pet;
import com.rexus.pets.tipopet.TipoPet;

@Component
public class RepositoryConfigurerAdapter extends RepositoryRestConfigurerAdapter {
    
    private static final Class<?>[] ENTIDADES_PARA_EXPOR_ID = {
            Pet.class,
            TipoPet.class
    };
    
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    config.exposeIdsFor(ENTIDADES_PARA_EXPOR_ID);
		configurarCors(config);
	}

	private void configurarCors(RepositoryRestConfiguration config) {
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("http://localhost:3000")
			.allowedMethods(
					HttpMethod.GET.toString(),
					HttpMethod.POST.toString(),
					HttpMethod.PUT.toString(),
					HttpMethod.PATCH.toString(),
					HttpMethod.DELETE.toString(),
					HttpMethod.OPTIONS.toString());
	}
}
