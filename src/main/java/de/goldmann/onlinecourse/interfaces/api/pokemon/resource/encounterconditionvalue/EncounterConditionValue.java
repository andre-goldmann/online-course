package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encounterconditionvalue;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encountercondition.EncounterCondition;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;

public class EncounterConditionValue implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private NamedApiResource<EncounterCondition> condition;
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
    public NamedApiResource<EncounterCondition> getCondition() {
        return condition;
    }
    public void setCondition(NamedApiResource<EncounterCondition> condition) {
        this.condition = condition;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }

}
