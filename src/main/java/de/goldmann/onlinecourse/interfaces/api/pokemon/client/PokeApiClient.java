package de.goldmann.onlinecourse.interfaces.api.pokemon.client;

import de.goldmann.onlinecourse.interfaces.api.pokemon.query.PageQuery;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResourceList;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Supplier;

public interface PokeApiClient {

    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls);
    <T extends PokeApiResource> Mono<T> getResource(Class<T> cls, String idOrName);
    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls, PageQuery query);
    <T extends PokeApiResource> Mono<T> followResource(Supplier<NamedApiResource<T>> resourceSupplier, Class<T> cls);
    <T extends PokeApiResource> Flux<T> followResources(Supplier<List<NamedApiResource<T>>> resourcesSupplier, Class<T> cls);
}
