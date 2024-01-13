package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itemflingeffect;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Effect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item.Item;

import java.util.List;

public class ItemFlingEffect implements PokeApiResource {

    private Integer id;
    private String name;
    private List<Effect> effectEntries;
    private List<NamedApiResource<Item>> items;

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
    public List<Effect> getEffectEntries() {
        return effectEntries;
    }
    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }
    public List<NamedApiResource<Item>> getItems() {
        return items;
    }
    public void setItems(List<NamedApiResource<Item>> items) {
        this.items = items;
    }

}
