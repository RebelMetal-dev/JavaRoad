package de.rebelmetal.javaroad.portfolio.bibliothek;

import java.util.*;

/**
 * Manages the entire book inventory of the application.
 * <p>
 * Serves as the central storage for {@link Buch} objects and ensures
 * that each book appears only once in the inventory, thanks to the use
 * of a {@link Set} and the book's unique ISBN.
 */
public class Bibliothek {
    private final Set<Buch> buecher;

    /**
     * Creates a new, empty library.
     */
    public Bibliothek() {
        this.buecher = new HashSet<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param neuesBuch the {@link Buch} object to add.
     */
    public void buchHinzufuegen(Buch neuesBuch) {
        this.buecher.add(neuesBuch);
    }

    /**
     * Searches for a book by its ISBN.
     *
     * @param isbn the ISBN of the book to find.
     * @return an {@link Optional} containing the found book,
     *         or an empty {@link Optional} if no book with that ISBN exists.
     */
    public Optional<Buch> findeBuchNachIsbn(String isbn){
        return this.buecher.stream()
                .filter(buch -> buch.isbn().equals(isbn))
                .findFirst();
    }

    /**
     * Returns all books sorted alphabetically by title.
     * <p>
     * Uses a Stream pipeline to convert the internal Set to a List
     * and sorts it using a {@link Comparator} on the book's title.
     * </p>
     *
     * @return a {@link List} of all books, sorted by title.
     */
    public List<Buch> findeAlleBuecher() {
        return this.buecher.stream()
                .sorted(Comparator.comparing(Buch::titel))
                .toList();
    }



}
