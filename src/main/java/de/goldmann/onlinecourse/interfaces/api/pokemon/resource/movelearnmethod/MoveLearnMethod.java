package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movelearnmethod;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Description;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class MoveLearnMethod implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Description> descriptions;
    private List<Name> names;
    private List<NamedApiResource<VersionGroup>> versionGroups;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Description> getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }
    public List<NamedApiResource<VersionGroup>> getVersionGroups() {
        return versionGroups;
    }
    public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
        this.versionGroups = versionGroups;
    }

}
