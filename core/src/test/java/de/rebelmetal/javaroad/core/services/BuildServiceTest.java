package de.rebelmetal.javaroad.core.services;

import de.rebelmetal.javaroad.core.models.PoECharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

/**
 * Unit tests for {@link BuildService}.
 * <p>
 * Verifies in-memory build management without external dependencies.
 * No mocking required — BuildService holds its own state via an internal List.
 */

 class BuildServiceTest {
    private BuildService buildService;

    @BeforeEach
    void setUp() {
        buildService = new BuildService();
    }

    @Test
    @DisplayName("getAllBuilds should return empty list when no builds are saved")
    void getAllBuilds_shouldReturnEmptyList_whenNoBuildsAreSaved() {
        // Act
        List<PoECharacter> result = buildService.getAllBuilds();

        // Assert
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("saveBuild should add one build to the list")
    void saveBuild_shouldAddBuildToList() {
        // Arrange
        PoECharacter character = PoECharacter.of("Kira", "Witch", 50, "Fire Spell");

        // Act
        buildService.saveBuild(character);

        // Assert
        assertThat(buildService.getAllBuilds()).hasSize(1);
    }

    @Test
    @DisplayName("saveBuild should store multiple builds correctly")
    void saveBuild_shouldStoreMultipleBuilds() {
        // Arrange
        PoECharacter first = PoECharacter.of("Kira", "Witch", 50, "Fire Spell");
        PoECharacter second = PoECharacter.of("Magnus", "Warrior", 30, "Melee Slam");

        // Act
        buildService.saveBuild(first);
        buildService.saveBuild(second);

        // Assert
        assertThat(buildService.getAllBuilds()).hasSize(2);
    }
}
