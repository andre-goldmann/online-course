package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movedamageclass;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Description;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move.Move;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;


public class MoveDamageClass implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Description> descriptions;
    private List<NamedApiResource<Move>> moves;
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
    public List<Description> getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }
    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }

}
