package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.contesteffect;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Effect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.FlavorText;

import java.util.List;


public class ContestEffect {

    private Integer id;
    private Integer appeal;
    private Integer jam;
    private List<Effect> effectEntries;
    private List<FlavorText> flavorTextEntries;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAppeal() {
        return appeal;
    }
    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }
    public Integer getJam() {
        return jam;
    }
    public void setJam(Integer jam) {
        this.jam = jam;
    }
    public List<Effect> getEffectEntries() {
        return effectEntries;
    }
    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }
    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }
    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

}
