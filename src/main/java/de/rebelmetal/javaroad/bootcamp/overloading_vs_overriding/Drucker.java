package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;



/**
 * Eine Basisklasse, die verschiedene Arten von Daten drucken kann.
 *
 * Diese Klasse demonstriert das Konzept der Methoden-Überladung (Overloading),
 * indem sie mehrere `drucken`-Methoden mit unterschiedlichen Parameterlisten anbietet.
 *
 * @author Christoph Breddin
 * @version 1.0
 */

public class Drucker {


    /**
     * Druckt einen Text mit Standardpräfix.
     *
     * @param text Der auszugebende String.
     */
    public void drucken(String text) {
        System.out.println("Standard-Druck: " + text);
    }

    /**
     * Druckt einen Text mehrfach auf die Konsole.
     * Ignoriert negative Werte für 'anzahl' und gibt stattdessen eine Fehlermeldung aus.
     *
     * @param text  Der auszugebende String.
     * @param anzahl Die Wiederholungsanzahl. Muss null oder positiv sein.
     */
    public void drucken(String text, int anzahl) {
        // Prüft, ob die angegebene Anzahl negativ ist.
        if (anzahl < 0) {
            System.out.println("Fehler: Die Anzahl für den Druck kann nicht negativ sein.");
            return; // Beendet die Methode, wenn die Anzahl ungültig ist.
        }
            // Iteriert 'anzahl' Mal, um den Text entsprechend oft auszugeben.
            for (int i = 0; i < anzahl; i++) {
                System.out.println(text);
            }
        }

    /**
     * Druckt eine Ganzzahl mit Präfix.
     *
     * @param zahl Die auszugebende Ganzzahl.
     */
    public void drucken(int zahl) {
        System.out.println("Zahl wird gedruckt: " + zahl);
    }
}
