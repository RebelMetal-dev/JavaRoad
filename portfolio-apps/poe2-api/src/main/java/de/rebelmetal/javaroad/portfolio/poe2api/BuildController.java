package de.rebelmetal.javaroad.portfolio.poe2api;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import de.rebelmetal.javaroad.core.services.BuildService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller exposing endpoints for PoE character build data.
 * <p>
 * Note: seed data is currently initialized in the constructor for prototype
 * purposes. In a production application this should be moved to a
 * dedicated {@code CommandLineRunner} or {@code ApplicationRunner} bean.
 */
@RestController
public class BuildController {

    private final BuildService buildService;

    // Spring automatically injects the @Service bean from the core module
    public BuildController(BuildService buildService) {
        this.buildService = buildService;
    }

    @GetMapping("/builds")
    public List<PoECharacter> getBuilds() {
        return buildService.getAllBuilds();
    }
}