package de.goldmann.onlinecourse.config;

import de.goldmann.onlinecourse.interfaces.api.pokemon.client.PokeApiClient;
import de.goldmann.onlinecourse.interfaces.api.pokemon.client.PokeApiEntityFactory;
import de.goldmann.onlinecourse.interfaces.api.pokemon.client.ReactiveNonCachingPokeApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PokeApiReactorBaseConfiguration.class)
public class PokeApiReactorNonCachingConfiguration {

    @Bean
    public PokeApiClient pokeApiClient(PokeApiEntityFactory entityFactory) {
        return new ReactiveNonCachingPokeApiClient(entityFactory);
    }

}
