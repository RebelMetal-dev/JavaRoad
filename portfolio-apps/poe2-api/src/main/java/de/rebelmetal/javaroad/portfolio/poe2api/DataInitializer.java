package de.rebelmetal.javaroad.portfolio.poe2api;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import de.rebelmetal.javaroad.core.services.BuildService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Initialize seed data after the Spring context has fully started.
 * Separated startup logic from dependency injection in controllers.
 */

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(BuildService buildService) {
        return args -> buildService.saveBuild (PoECharacter.of ( "RebelExile", "Mercenary", 45, "Explosive Shot")
        );
    }
}



