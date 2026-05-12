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

        // Salary threshold and target department for filtering.
        double mindestBetragFuerFilter = 90000.00;
        String gesuchteAbteilung = "IT";

        // --- Stream Example 1: Search for a qualified IT employee ---

        // Finds the first employee matching both criteria.
        // The result is an Optional containing either the employee or empty.
        Optional<Mitarbeiter> gefundenerMitarbeiter = mitarbeiterListe.stream()
                // Filter for employees in the target department.
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals(gesuchteAbteilung))
                // Filter for employees who exceed the minimum salary.
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                // Return the first match wrapped in an Optional.
                .findFirst();

        // ifPresentOrElse keeps the code for both cases (found / not found) compact.
        gefundenerMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format(
                        "Top employee found: %s (ID: %d)", mitarbeiter.name(), mitarbeiter.id()
                )),
                () -> System.out.println("No IT employee with salary > 90,000 found.")
        );

        // --- Stream Example 2: Search in a non-existent department ---

        Optional<Mitarbeiter> gefundenerTestMitarbeiter = mitarbeiterListe.stream()
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals("Finance"))
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                .findFirst();

        // ifPresentOrElse for clean handling of both cases without null checks.
        gefundenerTestMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format(
                        "Employee found: %s (ID: %d)", mitarbeiter.name(), mitarbeiter.id()
                )),
                () -> System.out.println("No Finance employee found.")
        );
    }
}
