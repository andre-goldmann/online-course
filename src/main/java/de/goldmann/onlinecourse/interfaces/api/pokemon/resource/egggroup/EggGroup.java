package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.egggroup;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies.PokemonSpecies;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class EggGroup implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }
    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }
    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

}
