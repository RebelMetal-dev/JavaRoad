package de.rebelmetal.javaroad.core.models;

import java.util.HashMap;
import java.util.Map;

public class PoECharacter {
    private String name;
    private String characterClass;
    private int level;
    private String buildType;
    private Map<Attribute, Integer> stats;

    /**
     * Creates a new PoE character with base stats of 10 for all attributes.
     */
    public PoECharacter(String name, String characterClass, int level, String buildType) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.buildType = buildType;
        this.stats = new HashMap<>();

        // Initialize all attributes with a base value of 10
        stats.put(Attribute.STRENGTH, 10);
        stats.put(Attribute.DEXTERITY, 10);
        stats.put(Attribute.INTELLIGENCE, 10);
    }

    // Getters are required for Jackson serialization (JSON response mapping)
    public String getName() { return name; }
    public String getCharacterClass() { return characterClass; }
    public int getLevel() { return level; }
    public String getBuildType() { return buildType; }
    public Map<Attribute, Integer> getStats() { return stats; }

    public void setStat(Attribute attr, int value) {
        stats.put(attr, value);
    }

    @Override
    public String toString() {
        return "PoE2 Build: " + name + " [" + characterClass + "], Level: " + level + ", Build: " + buildType;
    }
}