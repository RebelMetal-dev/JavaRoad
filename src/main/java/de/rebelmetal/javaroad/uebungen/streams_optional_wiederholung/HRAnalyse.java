package de.rebelmetal.javaroad.uebungen.streams_optional_wiederholung;

import java.util.*;

public class HRAnalyse {

    public static void main(String[] args) {
        List<Mitarbeiter> mitarbeiterListe = List.of(
                new Mitarbeiter(101, "Anna", "IT", 75000),
                new Mitarbeiter(102, "Peter", "Marketing", 65000),
                new Mitarbeiter(103, "Maria", "IT", 95000),
                new Mitarbeiter(104, "Chris", "Sales", 85000),
                new Mitarbeiter(105, "Sarah", "IT", 68000)
        );
        // Schwellenwert für das Gehalt und die gesuchte Abteilung.
        double mindestBetragFuerFilter = 90000.00;
        String gesuchteAbteilung = "IT";

        // --- Stream-Beispiel 1: Suche nach einem qualifizierten IT-Mitarbeiter ---

        // Findet den ersten Mitarbeiter, der die Kriterien erfüllt.
        // Das Ergebnis ist ein Optional, das entweder den Mitarbeiter oder "empty" enthält.
        Optional<Mitarbeiter> gefundenerMitarbeiter = mitarbeiterListe.stream()
                // Filtert Mitarbeiter der IT-Abteilung.
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals(gesuchteAbteilung))
                // Filtert nur Mitarbeiter, die das Mindestgehalt überschreiten.
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                // Sucht den ersten passenden Mitarbeiter und gibt ein Optional zurück.
                .findFirst();

        // Verwendet ifPresentOrElse, um den Code für beide Fälle (gefunden / nicht gefunden) kompakt zu halten.
        gefundenerMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format("Top-Mitarbeiter gefunden: Bestellung %s (ID: %d )", mitarbeiter.name(), mitarbeiter.id())),
                () -> System.out.println("Kein IT-Mitarbeiter mit Gehalt > 90.000 gefunden."));


        // --- Test-Stream-Beispiel 2: Suche in einer nicht vorhandenen Abteilung ---

        Optional<Mitarbeiter> gefundenerTestMitarbeiter = mitarbeiterListe.stream()
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals("Finance"))
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                .findFirst();


        // Nutzt ifPresentOrElse für die saubere Behandlung beider Fälle, ohne if-else-Block und Null-Checks
        gefundenerTestMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format("Mitarbeiter gefunden: Name: %s (ID: %d )", mitarbeiter.name(), mitarbeiter.id())),
                () -> System.out.println("Keinen Finance-Mitarbeiter gefunden"));


    }
}
