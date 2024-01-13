package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itempocket;

import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.Name;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.PokeApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itemcategory.ItemCategory;
import de.goldmann.onlinecourse.interfaces.api.pokemon.utils.Localizable;

import java.util.List;

public class ItemPocket implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<ItemCategory>> categories;
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
    public List<NamedApiResource<ItemCategory>> getCategories() {
        return categories;
    }
    public void setCategories(List<NamedApiResource<ItemCategory>> categories) {
        this.categories = categories;
    }
    public List<Name> getNames() {
        return names;
    }
    public void setNames(List<Name> names) {
        this.names = names;
    }

}
