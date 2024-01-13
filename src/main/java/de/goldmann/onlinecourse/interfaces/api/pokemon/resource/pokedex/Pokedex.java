package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokedex;


import java.util.List;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Description;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.region.Region;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;


public class Pokedex implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private List<Description> descriptions;
    private List<Name> names;
    private List<PokemonEntry> pokemonEntries;
    private NamedApiResource<Region> region;
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
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }
    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
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
    public List<PokemonEntry> getPokemonEntries() {
        return pokemonEntries;
    }
    public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
        this.pokemonEntries = pokemonEntries;
    }
    public NamedApiResource<Region> getRegion() {
        return region;
    }
    public void setRegion(NamedApiResource<Region> region) {
        this.region = region;
    }
    public List<NamedApiResource<VersionGroup>> getVersionGroups() {
        return versionGroups;
    }
    public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
        this.versionGroups = versionGroups;
    }

}
