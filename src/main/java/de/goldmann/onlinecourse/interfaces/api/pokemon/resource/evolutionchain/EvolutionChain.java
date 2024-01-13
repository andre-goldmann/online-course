package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.evolutionchain;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item.Item;

public class EvolutionChain {

    private Integer id;
    private NamedApiResource<Item> item;
    private ChainLink chain;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public NamedApiResource<Item> getItem() {
        return item;
    }
    public void setItem(NamedApiResource<Item> item) {
        this.item = item;
    }
    public ChainLink getChain() {
        return chain;
    }
    public void setChain(ChainLink chain) {
        this.chain = chain;
    }

}
