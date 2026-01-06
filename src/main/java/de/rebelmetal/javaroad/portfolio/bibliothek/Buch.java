package de.rebelmetal.javaroad.portfolio.bibliothek;

/**
 * Repräsentiert ein Buch mit einer eindeutigen ISBN,
 * dem Titel und dem Autor.
 * <p>
 * Als 'record' implementiert für automatische Unveränderlichkeit,
 * equals(), hashCode() und toString().
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param bestellNr die eindeutige ISBN
 * @param kundenName der Titel des Buches
 * @param betrag der Name des Autors
 */

public record Buch(String isbn, String titel, String autor) {
}
