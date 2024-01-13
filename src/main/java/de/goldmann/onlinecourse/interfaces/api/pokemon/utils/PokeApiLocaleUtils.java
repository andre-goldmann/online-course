package de.goldmann.onlinecourse.interfaces.api.pokemon.utils;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;

import java.util.Optional;

public class PokeApiLocaleUtils {

    public static Optional<Name> getInLocale(Localizable localizable, String locale) {
        return localizable.getNames().stream()
                .filter(name -> name.getLanguage().getName().equalsIgnoreCase(locale))
                .findFirst();
    }

}
