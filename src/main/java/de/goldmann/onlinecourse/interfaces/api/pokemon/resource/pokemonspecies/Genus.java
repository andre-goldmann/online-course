package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.language.Language;

public class Genus {

    private String genus;
    private NamedApiResource<Language> language;

    public String getGenus() {
        return genus;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }
    public NamedApiResource<Language> getLanguage() {
        return language;
    }
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

}