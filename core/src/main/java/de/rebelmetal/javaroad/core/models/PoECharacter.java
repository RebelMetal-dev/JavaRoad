package de.rebelmetal.javaroad.core.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Immutable representation of a Path of Exile 2 character build.
 *
 * Use {@link #of(String, String, int, String)} to create an instance
 * with default base stats of 10 for all attributes.
 *
 * @param name           the character's name
 * @param characterClass the chosen character class
 * @param level          the current character level
 * @param buildType      the primary skill or build archetype
 * @param stats          an unmodifiable map of attribute values
 */
public record PoECharacter(String name, String characterClass, int level, String buildType,
                           Map<Attribute, Integer> stats) {

    public PoECharacter {
        stats = Map.copyOf(stats);
    }


    /**
     * Creates a new PoECharacter with default base stats of 10 for all attributes.
     */
    public static PoECharacter of(String name, String characterClass, int level, String buildType) {
        Map<Attribute, Integer> defaultStats = new HashMap<>();
        defaultStats.put(Attribute.STRENGTH, 10);
        defaultStats.put(Attribute.DEXTERITY, 10);
        defaultStats.put(Attribute.INTELLIGENCE, 10);
        return new PoECharacter(name, characterClass, level, buildType, defaultStats);
    }

    /**
     * Returns a new PoECharacter with the given attribute set to the specified value.
     */
    public PoECharacter withStats(Attribute attr, int value) {
        Map<Attribute, Integer> newStat = new HashMap<>(stats);
        newStat.put(attr, value);
        return new  PoECharacter(name, characterClass, level, buildType, newStat);
    }

    /**
     * Returns a new PoECharacter with the given level.
     */
    public  PoECharacter withLevel(int newLevel) {
        return new PoECharacter(name, characterClass, newLevel, buildType, stats);
    }
}