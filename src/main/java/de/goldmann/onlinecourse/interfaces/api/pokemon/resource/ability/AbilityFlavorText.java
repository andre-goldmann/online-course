package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.ability;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.language.Language;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;

public class AbilityFlavorText {

    private String flavorText;
    private NamedApiResource<Language> language;
    private NamedApiResource<VersionGroup> versionGroup;

    public String getFlavorText() {
        return flavorText;
    }
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }
    public NamedApiResource<Language> getLanguage() {
        return language;
    }
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

}
