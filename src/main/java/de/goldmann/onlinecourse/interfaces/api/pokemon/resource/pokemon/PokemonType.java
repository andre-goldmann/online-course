package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type.Type;

public class PokemonType {

    private Integer slot;
    private NamedApiResource<Type> type;

    public Integer getSlot() {
        return slot;
    }
    public void setSlot(Integer slot) {
        this.slot = slot;
    }
    public NamedApiResource<Type> getType() {
        return type;
    }
    public void setType(NamedApiResource<Type> type) {
        this.type = type;
    }

}