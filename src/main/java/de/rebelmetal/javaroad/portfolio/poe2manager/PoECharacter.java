package de.rebelmetal.javaroad.portfolio.poe2manager;

import java.util.HashMap;
import java.util.Map;

public class PoECharacter {
    private String name;
    private String characterClass;
    private Map<Attribute, Integer> stats;

    public PoECharacter(String name, String characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.stats = new HashMap<>();
        // Startwerte setzen
        stats.put(Attribute.STRENGTH, 10);
        stats.put(Attribute.DEXTERITY, 10);
        stats.put(Attribute.INTELLIGENCE, 10);
    }

    public void setStat(Attribute attr, int value) {
        stats.put(attr, value);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PoE2 Build: " + name + " [" + characterClass + "]\nStats: " + stats;
    }
}