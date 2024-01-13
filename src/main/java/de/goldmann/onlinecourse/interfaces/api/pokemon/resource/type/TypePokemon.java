package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;

public class TypePokemon {

    private Integer slot;
    private NamedApiResource<Pokemon> pokemon;

    public Integer getSlot() {
        return slot;
    }
    public void setSlot(Integer slot) {
        this.slot = slot;
    }
    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }
    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

}
