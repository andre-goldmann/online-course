package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type;


import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.NamedApiResource;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.generation.Generation;

public class TypeRelationsPast {

    private NamedApiResource<Generation> generation;
    private TypeRelations damageRelations;

    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }
    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }
}