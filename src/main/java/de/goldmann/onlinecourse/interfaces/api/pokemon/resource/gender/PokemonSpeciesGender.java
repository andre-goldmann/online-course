package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.gender;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies.PokemonSpecies;

public class PokemonSpeciesGender {

    private Integer rate;
    private NamedApiResource<PokemonSpecies> pokemonSpecies;

    public Integer getRate() {
        return rate;
    }
    public void setRate(Integer rate) {
        this.rate = rate;
    }
    public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
        return pokemonSpecies;
    }
    public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

}
