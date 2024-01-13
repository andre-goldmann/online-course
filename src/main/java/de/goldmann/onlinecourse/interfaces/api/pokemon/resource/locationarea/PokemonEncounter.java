package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.locationarea;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.VersionEncounterDetail;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;

import java.util.List;


public class PokemonEncounter {

    private NamedApiResource<Pokemon> pokemon;
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }
    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }
    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

}