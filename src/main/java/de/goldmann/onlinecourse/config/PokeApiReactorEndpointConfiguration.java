package de.goldmann.onlinecourse.config;

import de.goldmann.onlinecourse.interfaces.api.pokemon.client.MapEndpointRegistry;
import de.goldmann.onlinecourse.interfaces.api.pokemon.client.PokeApiEndpointRegistry;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.ability.Ability;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berry.Berry;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berryfirmness.BerryFirmness;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.berryflavor.BerryFlavor;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.characteristic.Characteristic;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.contesteffect.ContestEffect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.contesttype.ContestType;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.egggroup.EggGroup;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encountercondition.EncounterCondition;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encounterconditionvalue.EncounterConditionValue;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.encountermethod.EncounterMethod;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.evolutionchain.EvolutionChain;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.evolutiontrigger.EvolutionTrigger;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.gender.Gender;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.generation.Generation;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.growthrate.GrowthRate;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item.Item;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itemattribute.ItemAttribute;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itemcategory.ItemCategory;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itemflingeffect.ItemFlingEffect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.itempocket.ItemPocket;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.language.Language;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.location.Location;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.locationarea.LocationArea;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.machine.Machine;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.move.Move;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.moveailment.MoveAilment;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movecategory.MoveCategory;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movedamageclass.MoveDamageClass;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movelearnmethod.MoveLearnMethod;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.movetarget.MoveTarget;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.nature.Nature;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokedex.Pokedex;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.Pokemon;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemon.pokemonform.PokemonForm;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemoncolor.PokemonColor;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonhabitat.PokemonHabitat;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonshape.PokemonShape;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.pokemonspecies.PokemonSpecies;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.region.Region;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.stat.Stat;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.supercontesteffect.SuperContestEffect;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.type.Type;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.version.Version;
import de.goldmann.onlinecourse.interfaces.api.pokemon.resource.versiongroup.VersionGroup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class PokeApiReactorEndpointConfiguration {

    @Bean
    public PokeApiEndpointRegistry endpointRegistry() {
        Map<Class<?>, String> endpoints = new HashMap<>();
        endpoints.put(Ability.class, "ability");
        endpoints.put(Berry.class, "berry");
        endpoints.put(BerryFirmness.class, "berry-firmness");
        endpoints.put(BerryFlavor.class, "berry-flavor");
        endpoints.put(Characteristic.class, "characteristic");
        endpoints.put(ContestEffect.class, "contest-effect");
        endpoints.put(ContestType.class, "contest-type");
        endpoints.put(EggGroup.class, "egg-group");
        endpoints.put(EncounterCondition.class, "encounter-condition");
        endpoints.put(EncounterConditionValue.class, "encounter-condition-value");
        endpoints.put(EncounterMethod.class, "encounter-method");
        endpoints.put(EvolutionChain.class, "evolution-chain");
        endpoints.put(EvolutionTrigger.class, "evolution-trigger");
        endpoints.put(Gender.class, "gender");
        endpoints.put(Generation.class, "generation");
        endpoints.put(GrowthRate.class, "growth-rate");
        endpoints.put(Item.class, "item");
        endpoints.put(ItemAttribute.class, "item-attribute");
        endpoints.put(ItemCategory.class, "item-category");
        endpoints.put(ItemFlingEffect.class, "item-fling-effect");
        endpoints.put(ItemPocket.class, "item-pocket");
        endpoints.put(Language.class, "language");
        endpoints.put(Location.class, "location");
        endpoints.put(LocationArea.class, "location-area");
        endpoints.put(Machine.class, "machine");
        endpoints.put(Move.class, "move");
        endpoints.put(MoveAilment.class, "move-ailment");
        endpoints.put(MoveCategory.class, "move-category");
        endpoints.put(MoveDamageClass.class, "move-damage-class");
        endpoints.put(MoveLearnMethod.class, "move-learn-method");
        endpoints.put(MoveTarget.class, "move-target");
        endpoints.put(Nature.class, "nature");
        endpoints.put(Pokedex.class, "pokedex");
        endpoints.put(Pokemon.class, "pokemon");
        endpoints.put(PokemonColor.class, "pokemon-color");
        endpoints.put(PokemonForm.class, "pokemon-form");
        endpoints.put(PokemonHabitat.class, "pokemon-habitat");
        endpoints.put(PokemonShape.class, "pokemon-shape");
        endpoints.put(PokemonSpecies.class, "pokemon-species");
        endpoints.put(Region.class, "pokemon-region");
        endpoints.put(Stat.class, "stat");
        endpoints.put(SuperContestEffect.class, "super-contest-effect");
        endpoints.put(Type.class, "type");
        endpoints.put(Version.class, "version");
        endpoints.put(VersionGroup.class, "version-group");

        return new MapEndpointRegistry(endpoints);
    }
}