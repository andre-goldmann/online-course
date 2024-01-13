package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.stat.Stat;

public class PokemonStat {

    private NamedApiResource<Stat> stat;
    private Integer effort;
    private Integer baseStat;

    public NamedApiResource<Stat> getStat() {
        return stat;
    }
    public void setStat(NamedApiResource<Stat> stat) {
        this.stat = stat;
    }
    public Integer getEffort() {
        return effort;
    }
    public void setEffort(Integer effort) {
        this.effort = effort;
    }
    public Integer getBaseStat() {
        return baseStat;
    }
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

}
