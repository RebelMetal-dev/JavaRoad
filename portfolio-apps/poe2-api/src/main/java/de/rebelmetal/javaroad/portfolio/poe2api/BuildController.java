package de.rebelmetal.javaroad.portfolio.poe2api;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import de.rebelmetal.javaroad.core.services.BuildService; // Wichtig: Import aus dem core-Modul
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuildController {

    private final BuildService buildService;

    // Spring findet den @Service im core-Modul automatisch und setzt ihn hier ein
    public BuildController(BuildService buildService) {
        this.buildService = buildService;

        // Wir fügen direkt einen Test-Charakter hinzu, damit die Liste nicht leer ist
        this.buildService.saveBuild(new PoECharacter("RebelExile", "Mercenary", 45, "Explosive Shot"));
    }

    @GetMapping("/builds")
    public List<PoECharacter> getBuilds() {
        return buildService.getAllBuilds();
    }
}