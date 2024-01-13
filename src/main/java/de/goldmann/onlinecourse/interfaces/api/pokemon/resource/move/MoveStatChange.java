package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.stat.Stat;

public class MoveStatChange {

    private Integer change;
    private NamedApiResource<Stat> stat;

    public Integer getChange() {
        return change;
    }
    public void setChange(Integer change) {
        this.change = change;
    }
    public NamedApiResource<Stat> getStat() {
        return stat;
    }
    public void setStat(NamedApiResource<Stat> stat) {
        this.stat = stat;
    }

}