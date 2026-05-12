package de.rebelmetal.javaroad.portfolio.poe2manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Handles file-based persistence of PoE character builds.
 * <p>
 * Part of the Phase 2 portfolio project demonstrating Java File I/O ({@link Files}).
 * Each build is serialized as a plain-text {@code .txt} file named after the character.
 * <p>
 * Note: This class is intentionally kept simple to showcase {@code java.nio.file} usage.
 * For in-memory build management, see {@code core/services/BuildService}.
 */
public class BuildFileService {

    private static final String FOLDER = "builds" + java.io.File.separator;

    /**
     * Saves a character build as a .txt file in the builds folder.
     * <p>
     * Creates the target directory if it does not exist.
     * The file is named after the character and overwritten on each save.
     *
     * @param character the {@link PoECharacter} whose build data will be persisted.
     */
    public void saveBuild(PoECharacter character) {
        try {
            // Create the builds folder if it does not exist yet
            Path path = Paths.get(FOLDER);
            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }

            // Derive the file name from the character's name
            Path filePath = Paths.get(FOLDER + character.getName() + ".txt");

            // Write the character data using toString() as a simple text representation
            Files.writeString(filePath, character.toString(),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Build saved successfully: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error saving build: " + e.getMessage());
        }
    }
}
