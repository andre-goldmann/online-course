package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.generation;

import java.util.List;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.ability.Ability;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move.Move;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies.PokemonSpecies;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type.Type;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;


public class Generation implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<Ability>> abilities;
    private List<Name> names;
    private List<NamedApiResource<Move>> moves;
    private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
    private List<NamedApiResource<Type>> types;
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
    public List<NamedApiResource<Ability>> getAbilities() {
        return abilities;
    }
    public void setAbilities(List<NamedApiResource<Ability>> abilities) {
        this.abilities = abilities;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }
    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }
    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }
    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }
    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
    public List<NamedApiResource<Type>> getTypes() {
        return types;
    }
    public void setTypes(List<NamedApiResource<Type>> types) {
        this.types = types;
    }
    public List<NamedApiResource<VersionGroup>> getVersionGroups() {
        return versionGroups;
    }
    public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
        this.versionGroups = versionGroups;
    }

}
