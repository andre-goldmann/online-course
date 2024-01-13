package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.ability;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Effect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;

import java.util.List;


public class AbilityEffectChange {

    private List<Effect> effectEntries;
    private NamedApiResource<VersionGroup> versionGroup;

    public List<Effect> getEffectEntries() {
        return effectEntries;
    }
    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

}
