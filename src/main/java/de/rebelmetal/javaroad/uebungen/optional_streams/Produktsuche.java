package de.rebelmetal.javaroad.uebungen.optional_streams;

import java.util.*;

/**
 * Praktische Übung 2 zu den Java 8+ Features: Streams & Optional.
 *
 * Ziel: Demonstriert die Suche nach einem Element in einem Stream und die
 *       sichere Verarbeitung des Ergebnisses mit Optional.
 *
 * Aufgaben:
 * 1. Definiere ein Produkt-Record für die Datenhaltung.
 * 2. Benutze die Stream-API, um das erste Produkt zu finden, das teurer als 1000 Euro ist.
 * 3. Verarbeite das Ergebnis (ein Optional<Produkt>) sicher und gib entweder
 *    die Produktdetails oder eine "Nicht gefunden"-Meldung aus.
 *
 * @author Christoph Breddin
 * @version 1.0 */

public class Produktsuche {

    /**
     * Ein Record, der ein Produkt mit Namen und Preis darstellt.
     * Records sind eine kompakte Möglichkeit, unveränderliche Datenklassen zu erstellen.
     *
     * @param name  Der Name des Produkts.
     * @param preis Der Preis des Produkts.
     */
    public record Produkt(String name, double preis) {

    }


    public static void main(String[] args) {
        List<Produkt> produktkatalog = List.of(
                new Produkt("Laptop", 1299.99),
                new Produkt("Maus", 49.90),
                new Produkt("Tastatur", 89.95),
                new Produkt("Monitor", 349.50),
                new Produkt("High-End PC", 2499.00)
        );

        // Erzeugung eines Streams aus dem Produktkatalog, um die Suche durchzuführen.
        Optional<Produkt> gefundenesProdukt = produktkatalog.stream()
                // Filtert den Stream und behält nur Produkte, deren Preis über 1000.00 liegt.
                .filter(Produkt -> Produkt.preis() > 1000.00)
                // Findet das erste Element im gefilterten Stream und gibt es als Optional zurück.
                .findFirst();


        // Überprüfung, ob ein Produkt gefunden wurde, und entsprechende Ausgabe.
        // ifPresentOrElse ist eine Methode von Optional, die den Code kompakter macht.
        gefundenesProdukt.ifPresentOrElse(
                // Dieser Block wird ausgeführt, wenn ein Produkt vorhanden ist.
                produkt -> System.out.println(String.format("Gefunden: %s für %.2f.", produkt.name(), produkt.preis())),
                // Dieser Block wird ausgeführt, wenn das Optional leer ist (kein Produkt gefunden).
                () -> System.out.println("Kein Produkt über 1000 Euro gefunden.")
        );
    }
}
