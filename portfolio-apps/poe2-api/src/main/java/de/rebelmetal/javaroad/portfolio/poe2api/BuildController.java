package de.rebelmetal.javaroad.portfolio.poe2api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.rebelmetal.javaroad.core.models.PoECharacter;

/**
 * Der Controller ist die Schnittstelle nach außen.
 * Hier definieren wir, welche URL-Pfade welche Daten zurückgeben.
 */
@RestController
@RequestMapping("/api")
public class BuildController {

    @GetMapping("/charakter")
    public PoECharacter getMyCharacter() {
        // Wir erstellen ein Objekt der Klasse, die eigentlich in 'core' liegt
        // Falls dein Konstruktor in Phase 2 anders aussah, musst du die Werte anpassen!
        return new PoECharacter("RebelExile", "Mercenary", 45, "Explosive Shot");
    }
}
