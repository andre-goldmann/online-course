package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.ability;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;

public class AbilityPokemon {

    private Boolean isHidden;
    private Integer slot;
    private NamedApiResource<Pokemon> pokemon;

    public Boolean getIsHidden() {
        return isHidden;
    }
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }
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
