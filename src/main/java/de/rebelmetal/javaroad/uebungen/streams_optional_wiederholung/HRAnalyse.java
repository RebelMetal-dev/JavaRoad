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

        double mindestBetragFuerFilter = 90000.00;
      String gesuchteAbteilung = "IT";

        Optional<Mitarbeiter> gefundenerMitarbeiter = mitarbeiterListe.stream()
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals(gesuchteAbteilung))
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                .findFirst();

        gefundenerMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format("Top-Mitarbeiter gefunden: Bestellung %s (ID: %d )", mitarbeiter.name(), mitarbeiter.id())),
                () -> System.out.println("Kein IT-Mitarbeiter mit Gehalt > 90.000 gefunden."));

        Optional<Mitarbeiter> gefundenerTestMitarbeiter = mitarbeiterListe.stream()
                .filter(mitarbeiter -> mitarbeiter.abteilung().equals("Finance"))
                .filter(mitarbeiter -> mitarbeiter.gehalt() > mindestBetragFuerFilter)
                .findFirst();

        gefundenerTestMitarbeiter.ifPresentOrElse(
                mitarbeiter -> System.out.println(String.format("Mitarbeiter gefunden: Name: %s (ID: %d )", mitarbeiter.name(), mitarbeiter.id())),
                () -> System.out.println("Keinen Finance-Mitarbeiter gefunden"));


    }
}
