package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.goldmann.onlinecourse.interfaces.api.pokemon.client.PokeApiClient;
import de.goldmann.onlinecourse.interfaces.api.pokemon.query.PageQuery;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Route(value="pokemondemo", layout = MainView.class)
@PageTitle("PokemonDemo")
public class PokemonDemo extends VerticalLayout {

    public PokemonDemo(PokeApiClient pokeApiClient) {
        /*pokeApiClient.getResource(Pokemon.class, "pikachu")
                .map(pokemon -> String.format("%s has %d forms", pokemon.getName(), pokemon.getForms().size()))
                .subscribe(System.out::println);*/
        ComboBox<Pokemon> pokemonsCb = new ComboBox<>("Choose Pokemon");
        pokemonsCb.setItemLabelGenerator(
                person -> person.getName());
        Set<Pokemon> pokemons = new HashSet<>();
        PageQuery query = new PageQuery(10, 1);
        // Images:
        //https://unpkg.com/pokeapi-sprites@2.0.2/sprites/pokemon/other/dream-world/87.svg
        //https://pokeapi.co/api/v2/pokemon/23/ -> look in sprites
        //https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png
        // TODO how to do this in a better way and fill the CompoBox with more Entries
        List<NamedApiResource<Pokemon>> list = pokeApiClient.getResource(Pokemon.class, query)
                .map(result -> result.getResults()).block();
        list.forEach(e -> pokemons.add(pokeApiClient.getResource(Pokemon.class, e.getName()).block()));

        pokemons.forEach(p -> System.out.println(p.getSpecies()));

        pokemonsCb.setItems(pokemons);
        add(pokemonsCb);

    }

}
