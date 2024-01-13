package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.location;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.GenerationGameIndex;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.locationarea.LocationArea;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.region.Region;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class Location implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private NamedApiResource<Region> region;
    private List<Name> names;
    private List<GenerationGameIndex> gameIndices;
    private List<NamedApiResource<LocationArea>> areas;

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
    public NamedApiResource<Region> getRegion() {
        return region;
    }
    public void setRegion(NamedApiResource<Region> region) {
        this.region = region;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }
    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }
    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }
    public List<NamedApiResource<LocationArea>> getAreas() {
        return areas;
    }
    public void setAreas(List<NamedApiResource<LocationArea>> areas) {
        this.areas = areas;
    }

}
