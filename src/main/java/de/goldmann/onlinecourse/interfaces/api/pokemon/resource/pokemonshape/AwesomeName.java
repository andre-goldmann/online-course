package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonshape;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.language.Language;

public class AwesomeName {

    private String awesomeName;
    private NamedApiResource<Language> language;

    public String getAwesomeName() {
        return awesomeName;
    }
    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
    }
    public NamedApiResource<Language> getLanguage() {
        return language;
    }
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

}
