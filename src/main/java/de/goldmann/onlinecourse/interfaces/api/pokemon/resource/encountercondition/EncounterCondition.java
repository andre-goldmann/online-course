package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encountercondition;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encounterconditionvalue.EncounterConditionValue;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class EncounterCondition implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<EncounterConditionValue>> values;

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
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }
    public List<NamedApiResource<EncounterConditionValue>> getValues() {
        return values;
    }
    public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
        this.values = values;
    }

}