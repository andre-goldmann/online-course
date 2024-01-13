package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berryflavor;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berry.Berry;

public class FlavorBerryMap {

    private Integer potency;
    private NamedApiResource<Berry> berry;

    public Integer getPotency() {
        return potency;
    }
    public void setPotency(Integer potency) {
        this.potency = potency;
    }
    public NamedApiResource<Berry> getBerry() {
        return berry;
    }
    public void setBerry(NamedApiResource<Berry> berry) {
        this.berry = berry;
    }

}
