package de.rebelmetal.javaroad.core.services;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import org.springframework.stereotype.Service;// WICHTIG: Import hinzufügen

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildService {
    private List<PoECharacter> savedBuilds = new ArrayList<>();

    public void saveBuild(PoECharacter character) {
        savedBuilds.add(character);
        System.out.println("Speichere Build: " + character.getName());
    }

    public List<PoECharacter> getAllBuilds() {
        return savedBuilds;
    }
}