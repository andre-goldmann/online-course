package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;

import java.util.List;


public class ItemHolderPokemon {

    private NamedApiResource<Pokemon> pokemon;
    private List<ItemHolderPokemonVersionDetail> versionDetails;

    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }
    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
        return versionDetails;
    }
    public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

}
