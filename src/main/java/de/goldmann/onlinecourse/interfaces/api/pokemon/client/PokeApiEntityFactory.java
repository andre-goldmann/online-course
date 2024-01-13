package de.goldmann.onlinecourse.interfaces.api.pokemon.client;

import java.util.List;

import de.goldmann.onlinecourse.interfaces.api.pokemon.query.PageQuery;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResourceList;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PokeApiEntityFactory {

    <T extends PokeApiResource> Mono<T> getResource(Class<T> resourceClass, String nameOrId);
    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass);
    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass, PageQuery query);
    <T extends PokeApiResource> Mono<T> getNamedResource(NamedApiResource<T> resource, Class<T> resourceClass);
    <T extends PokeApiResource> Flux<T> getNamedResources(List<NamedApiResource<T>> resources, Class<T> resourceClass);

}
