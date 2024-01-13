package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item.Item;

import java.util.List;


public class PokemonHeldItem {

    private NamedApiResource<Item> item;
    private List<PokemonHeldItemVersion> versionDetails;

    public NamedApiResource<Item> getItem() {
        return item;
    }
    public void setItem(NamedApiResource<Item> item) {
        this.item = item;
    }
    public List<PokemonHeldItemVersion> getVersionDetails() {
        return versionDetails;
    }
    public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }

}
