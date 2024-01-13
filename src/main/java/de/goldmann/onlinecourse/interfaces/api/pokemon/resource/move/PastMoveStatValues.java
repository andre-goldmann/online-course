package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.VerboseEffect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type.Type;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;

import java.util.List;


public class PastMoveStatValues {

    private Integer accuracy;
    private Integer effectChance;
    private Integer power;
    private Integer pp;
    private List<VerboseEffect> effectEntries;
    private NamedApiResource<Type> type;
    private NamedApiResource<VersionGroup> versionGroup;

    public Integer getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }
    public Integer getEffectChance() {
        return effectChance;
    }
    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }
    public Integer getPower() {
        return power;
    }
    public void setPower(Integer power) {
        this.power = power;
    }
    public Integer getPp() {
        return pp;
    }
    public void setPp(Integer pp) {
        this.pp = pp;
    }
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }
    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }
    public NamedApiResource<Type> getType() {
        return type;
    }
    public void setType(NamedApiResource<Type> type) {
        this.type = type;
    }
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

}
