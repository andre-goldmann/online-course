package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berry;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berryflavor.BerryFlavor;

public class BerryFlavorMap {

    private Integer potency;
    private NamedApiResource<BerryFlavor> flavor;

    public Integer getPotency() {
        return potency;
    }
    public void setPotency(Integer potency) {
        this.potency = potency;
    }
    public NamedApiResource<BerryFlavor> getFlavor() {
        return flavor;
    }
    public void setFlavor(NamedApiResource<BerryFlavor> flavor) {
        this.flavor = flavor;
    }

}