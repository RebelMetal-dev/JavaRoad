package de.rebelmetal.javaroad.portfolio.bibliothek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
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

    @Test
    @DisplayName("findeBuchNachIsbn should return empty when ISBN does not exist")
    void findeBuchNachIsbn_shouldReturnEmpty_whenIsbnDoesNotExist() {
        // Arrange — no book added

        // Act
        Optional<Buch> result = bibliothek.findeBuchNachIsbn("999");

        // Assert
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("findeAlleBuecher should return books sorted alphabetically by title")
    void findeAlleBuecher_shouldReturnBooksSortedAlphabetically() {
        // Arrange
        bibliothek.buchHinzufuegen(buch2); // "Effective Java"
        bibliothek.buchHinzufuegen(buch1); // "Clean Code"

        // Act
        List<Buch> result = bibliothek.findeAlleBuecher();

        // Assert
        assertThat(result).extracting(Buch::titel)
                .containsExactly("Clean Code", "Effective Java");
    }

    @Test
    @DisplayName("buchHinzufuegen should not add duplicate when same book added twice")
    void buchHinzufuegen_shouldNotAddDuplicate_whenSameBookAddedTwice() {
        // Arrange
        bibliothek.buchHinzufuegen(buch1);
        bibliothek.buchHinzufuegen(buch1); // same object again

        // Act
        List<Buch> result = bibliothek.findeAlleBuecher();

        // Assert
        assertThat(result).hasSize(1);
    }
}