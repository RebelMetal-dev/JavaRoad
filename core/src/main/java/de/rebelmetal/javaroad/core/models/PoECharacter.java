package de.rebelmetal.javaroad.core.models;

import java.util.HashMap;
import java.util.Map;

public class PoECharacter {
    private String name;
    private String characterClass;
    private int level;             // NEU
    private String buildType;      // NEU
    private Map<Attribute, Integer> stats;

    // Den Konstruktor von 2 auf 4 Parameter erweitern
    public PoECharacter(String name, String characterClass, int level, String buildType) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;        // NEU: Wert zuweisen
        this.buildType = buildType;// NEU: Wert zuweisen
        this.stats = new HashMap<>();

        // Startwerte setzen
        stats.put(Attribute.STRENGTH, 10);
        stats.put(Attribute.DEXTERITY, 10);
        stats.put(Attribute.INTELLIGENCE, 10);
    }

    // GETTER (Extrem wichtig! Ohne diese zeigt der Browser später nichts an)
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