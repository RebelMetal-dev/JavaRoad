package de.rebelmetal.javaroad.bootcamp.equals_hashcode;

import java.util.Objects;

/**
 * Repräsentiert ein Buch mit Titel und eindeutiger ISBN.
 *
 * Diese Klasse demonstriert die Notwendigkeit, equals() und hashCode()
 * korrekt zu überschreiben, damit Objekte in Collections wie HashSet
 * basierend auf ihrem inhaltlichen Schlüssel (ISBN) und nicht auf ihrer
 * Speicheradresse verglichen werden.
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
     * Vergleicht dieses Buch-Objekt mit dem angegebenen Objekt auf Gleichheit.
     * Zwei Bücher gelten als gleich, wenn sie denselben ISBN-Code haben.
     *
     * @param o Das Objekt, mit dem verglichen werden soll.
     * @return true, wenn die Objekte gleich sind, sonst false.
    */
    @Override
    public boolean equals(Object o) {
        // Prüft auf Referenzgleichheit (gleiches Objekt im Speicher).
        if (this == o) return true;
        // Prüft auf Null oder unterschiedliche Klassen (nicht nur Subklassen).
        if (o == null || getClass() != o.getClass()) return false;
        // Castet das Objekt sicher zu einem Buch, da der Typ bereits geprüft wurde.
        Buch buch = (Buch) o;
        // Vergleicht die ISBN-Codes auf Gleichheit, wobei Null-Sicherheit gewährleistet ist.
        return Objects.equals(isbn, buch.isbn);
    }

    /**
     * Berechnet den Hash-Code für dieses Buch-Objekt.
     * Der Hash-Code wird basierend auf dem ISBN-Code des Buches generiert.
     *
     * @return Der Hash-Code dieses Buch-Objekts.
    */
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

}
