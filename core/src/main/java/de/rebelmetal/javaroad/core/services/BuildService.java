package de.rebelmetal.javaroad.core.services;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service responsible for managing PoE character builds.
 * <p>
 * Holds an in-memory list of saved builds. In a production application
 * this would be replaced by a persistent repository (e.g. Spring Data JPA).
 */
@Service
public class BuildService {
    private List<PoECharacter> savedBuilds = new ArrayList<>();

    /**
     * Saves a character build to the in-memory list.
     *
     * @param character the {@link PoECharacter} to save.
     */
    public void saveBuild(PoECharacter character) {
        savedBuilds.add(character);
        System.out.println("Saving build: " + character.name());
    }

    /**
     * Returns all saved character builds.
     *
     * @return a {@link List} of all saved {@link PoECharacter} objects.
     */
    public List<PoECharacter> getAllBuilds() {
        return savedBuilds;
    }
}