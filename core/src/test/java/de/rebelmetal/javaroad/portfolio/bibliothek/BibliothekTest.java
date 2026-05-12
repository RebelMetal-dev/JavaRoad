package de.rebelmetal.javaroad.portfolio.bibliothek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link Bibliothek}.
 * <p>
 * Verifies book storage, ISBN lookup via Optional, and alphabetical sorting.
 * No mocking required — Bibliothek manages its own internal HashSet.
 */
class BibliothekTest {

    private Bibliothek bibliothek;
    private Buch buch1;
    private Buch buch2;

    @BeforeEach
    void setUp() {
        bibliothek = new Bibliothek();
        buch1 = new Buch("111", "Clean Code", "Robert Martin");
        buch2 = new Buch("222", "Effective Java", "Joshua Bloch");
    }

    @Test
    @DisplayName("findeBuchNachIsbn should return the correct book when ISBN exists")
    void findeBuchNachIsbn_shouldReturnBook_whenIsbnExists() {
        // Arrange
        bibliothek.buchHinzufuegen(buch1);

        // Act
        Optional<Buch> result = bibliothek.findeBuchNachIsbn("111");

        // Assert
        assertThat(result).isPresent();
        assertThat(result.get().titel()).isEqualTo("Clean Code");
    }
}