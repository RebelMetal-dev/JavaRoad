package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

import java.util.Scanner;

/**
 * Testklasse zur Demonstration der Funktionalität der Drucker und FarbDrucker Klassen.
 * Diese Klasse zeigt die Nutzung von Methodenüberladung und Polymorphie im Kontext des Druckens.
 */

public class DruckerTest {

    public static void main(String[] args) {

        // Erstellt eine Instanz des Standard-Druckers.
        Drucker meinDrucker = new Drucker();
        meinDrucker.drucken("ene menen popel");   // Demonstriert den Standarddruck.
        meinDrucker.drucken("LEtz Fetz", -1); // Testet die Fehlerbehandlung bei negativer Anzahl.
        meinDrucker.drucken(33);                 // Druckt eine Ganzzahl.

        // Erstellt eine Instanz des Farb-Druckers mit einem spezifischen Farbcode.
        FarbDrucker meinFarbDrucker = new FarbDrucker("Ansi-Gelb");
        // Demonstriert das überladene Druckverhalten des Farb-Druckers.
        meinFarbDrucker.drucken("Veni Vidi Vici");

        // Demonstriert Polymorphie: Ein FarbDrucker-Objekt wird als Drucker behandelt.
        // Die 'drucken'-Methode des FarbDruckers wird trotzdem korrekt aufgerufen (Laufzeit-Polymorphie).
        Drucker polyDrucker = new FarbDrucker("Ansi-Rot");
        polyDrucker.drucken("Veni Vidi Vici");

    }
}
