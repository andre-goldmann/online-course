package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berryfirmness;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berry.Berry;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class BerryFirmness implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<Berry>> berries;
    private List<Name> names;

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
    public List<NamedApiResource<Berry>> getBerries() {
        return berries;
    }
    public void setBerries(List<NamedApiResource<Berry>> berries) {
        this.berries = berries;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }

}
