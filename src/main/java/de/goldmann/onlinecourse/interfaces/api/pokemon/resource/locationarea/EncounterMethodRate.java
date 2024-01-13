package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.locationarea;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encountermethod.EncounterMethod;

import java.util.List;

public class EncounterMethodRate {

    private NamedApiResource<EncounterMethod> encounterMethod;
    private List<EncounterVersionDetails> versionDetails;

    public NamedApiResource<EncounterMethod> getEncounterMethod() {
        return encounterMethod;
    }
    public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
        this.encounterMethod = encounterMethod;
    }
    public List<EncounterVersionDetails> getVersionDetails() {
        return versionDetails;
    }
    public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
    }

}
