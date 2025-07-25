/* package de.rebelmetal.javaroad.uebungen.optional_streams;

import java.util.Optional;


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
 * @version 1.0

public class Produktsuche {

    // --- Aufgabe 1: Definiere ein Produkt-Record ---
    // Ein Record ist eine moderne, kurze Art, eine reine Datenklasse zu erstellen.

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

        // --- Aufgabe 2: Finde das erste teure Produkt ---
        // Benutze die Stream-API, um das ERSTE Produkt im Katalog zu finden,
        // dessen Preis GRÖSSER als 1000.00 ist.
        // Das Ergebnis von .findFirst() ist immer ein Optional!
        Optional<Produkt> gefundenesProdukt = produktkatalog.stream()
                .final(Produkt -> Produkt.preis() > 1000.00)
                .findFirst()

                ;


        // --- Aufgabe 3: Verarbeite das Ergebnis sicher mit Optional ---
        // Benutze eine Methode von Optional, um Folgendes zu tun:
        // WENN ein Produkt gefunden wurde, gib aus: "Gefunden: [Produktname] für [Preis] Euro."
        // WENN KEIN Produkt gefunden wurde, gib aus: "Kein Produkt über 1000 Euro gefunden."
        // TODO: Implementiere hier die sichere Verarbeitung des 'gefundenesProdukt'-Optionals.
        // Tipp: ifPresentOrElse(...) ist hierfür perfekt geeignet.

    }
}
*/