package de.rebelmetal.javaroad.bootcamp.equals_hashcode;

import java.util.Objects;

/**
 * Represents a book with a title and a unique ISBN.
 *
 * This class demonstrates why equals() and hashCode() must be overridden
 * correctly so that objects in collections like HashSet are compared
 * by their logical key (ISBN) rather than by memory address.
 *
 * @author Christoph Breddin
 * @version 1.0
 */

public class Buch {
    private final String isbn;
    private final String titel;

    public Buch(String isbn, String titel) {
        this.isbn = isbn;
        this.titel = titel;
    }


    /**
     * Compares this book object to the given object for equality.
     * Two books are considered equal if they share the same ISBN.
     *
     * @param o the object to compare against.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        // Check for reference equality (same object in memory).
        if (this == o) return true;
        // Reject null or a different class type.
        if (o == null || getClass() != o.getClass()) return false;
        // Safe cast — type has already been verified above.
        Buch buch = (Buch) o;
        // Compare ISBNs with null-safety via Objects.equals.
        return Objects.equals(isbn, buch.isbn);
    }

    /**
     * Computes the hash code for this book object.
     * The hash code is derived solely from the ISBN to stay consistent with equals().
     *
     * @return the hash code of this book object.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

}
