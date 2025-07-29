package de.rebelmetal.javaroad.uebungen.streams_optional_vertiefung;

/**
 * Repräsentiert eine Kundenbestellung mit einer eindeutigen Bestellnummer,
 * dem Kundennamen und dem Gesamtbetrag.
 * <p>
 * Als 'record' implementiert für automatische Unveränderlichkeit,
 * equals(), hashCode() und toString().
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param bestellNr die eindeutige Nummer der Bestellung
 * @param kundenName der Name des Kunden
 * @param betrag der Gesamtbetrag der Bestellung
 */


public record Bestellung (int bestellNr, String kundenName, double betrag) {

}

