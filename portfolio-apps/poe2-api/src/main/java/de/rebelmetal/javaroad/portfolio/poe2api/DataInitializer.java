package de.rebelmetal.javaroad.portfolio.poe2api;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import de.rebelmetal.javaroad.core.services.BuildService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Initialize seed data after the Spring context has fully started.
 * Seperated startup logic from dependency infection in controllers.
 */

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDate(BuildService buildService) {
        return args -> buildService.saveBuild (
                new PoECharacter ( "RebelExile", "Mercenary", 45, "Explosice Shot")
        );
    }
}



