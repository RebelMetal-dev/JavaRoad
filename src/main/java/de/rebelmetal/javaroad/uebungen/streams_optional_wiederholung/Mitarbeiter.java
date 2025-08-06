package de.rebelmetal.javaroad.uebungen.streams_optional_wiederholung;

/**
 * Repräsentiert einen Mitarbeiter mit ID, Namen, Abteilung und Gehalt.
 * Dient als Datenmodell für die Wiederholungsübung zu Streams und Optional.
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param id die eindeutige ID des Mitarbeiters
 * @param name der Name des Mitarbeiters
 * @param abteilung die Abteilung, in der der Mitarbeiter tätig ist
 * @param gehalt das Jahresgehalt des Mitarbeiters
 */

public record Mitarbeiter(int id, String name, String abteilung, double gehalt) {
}
