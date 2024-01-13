package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movecategory;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Description;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move.Move;

import java.util.List;


public class MoveCategory implements PokeApiResource {

    private Integer id;
    private String name;
    private List<NamedApiResource<Move>> moves;
    private List<Description> descriptions;

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
    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }
    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }
    public List<Description> getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

}
