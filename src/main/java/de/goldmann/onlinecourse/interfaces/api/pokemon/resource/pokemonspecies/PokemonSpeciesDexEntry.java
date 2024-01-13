package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokedex.Pokedex;

public class PokemonSpeciesDexEntry {

    private Integer entryNumber;
    private NamedApiResource<Pokedex> pokedex;

    public Integer getEntryNumber() {
        return entryNumber;
    }
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }
    public NamedApiResource<Pokedex> getPokedex() {
        return pokedex;
    }
    public void setPokedex(NamedApiResource<Pokedex> pokedex) {
        this.pokedex = pokedex;
    }

}
