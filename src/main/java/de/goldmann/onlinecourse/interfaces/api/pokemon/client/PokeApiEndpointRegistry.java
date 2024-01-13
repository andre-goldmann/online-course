package de.goldmann.onlinecourse.interfaces.api.pokemon.client;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;

public interface PokeApiEndpointRegistry {
    <T extends PokeApiResource> String getEndpoint(Class<T> resource);
}
