package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.version.Version;

public class PokemonHeldItemVersion {

    private NamedApiResource<Version> version;
    private Integer rarity;

    public NamedApiResource<Version> getVersion() {
        return version;
    }
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }
    public Integer getRarity() {
        return rarity;
    }
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

}
