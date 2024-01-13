package de.goldmann.onlinecourse.interfaces.api.pokemon.resource;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.language.Language;

public class Effect {

    private String effect;
    private NamedApiResource<Language> language;

    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    public NamedApiResource<Language> getLanguage() {
        return language;
    }
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

}
