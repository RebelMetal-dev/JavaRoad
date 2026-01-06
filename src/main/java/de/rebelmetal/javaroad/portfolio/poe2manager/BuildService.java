package de.rebelmetal.javaroad.portfolio.poe2manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BuildService {

    private static final String FOLDER = "builds" + java.io.File.separator;

    public void saveBuild(PoECharacter character) {
        try {
            // 1. Ordner erstellen, falls er nicht existiert
            Path path = Paths.get(FOLDER);
            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }

            // 2. Dateiname basierend auf dem Charakternamen
            Path filePath = Paths.get(FOLDER + character.getName() + ".txt");

            // 3. Daten schreiben (einfaches toString() für den Anfang)
            Files.writeString(filePath, character.toString(),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("✅ Build erfolgreich gespeichert unter: " + filePath.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("❌ Fehler beim Speichern: " + e.getMessage());
        }
    }
}