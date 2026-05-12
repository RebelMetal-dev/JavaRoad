package de.rebelmetal.javaroad.portfolio.bibliothek;

/**
 * Represents a book with a unique ISBN,
 * the title, and the author.
 *
 * Implemented as a {@code record} to ensure immutability,
 * equals(), hashCode(), and toString().
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param isbn the unique ISBN
 * @param titel the title of the book
 * @param autor the name of the author
 */

public record Buch(String isbn, String titel, String autor) {
}
