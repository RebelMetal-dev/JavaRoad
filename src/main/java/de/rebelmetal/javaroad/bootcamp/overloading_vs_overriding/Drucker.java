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



    public void drucken(String text) {
        System.out.println("Standard-Druck: " + text);
    }

    public void drucken(String text, int anzahl) {
        for(int i=0; i < anzahl; i++ ) {
            System.out.println(text);
        }
    }

    public void drucken(int zahl) {
        System.out.println("Zahl wird gedruckt: " + zahl);
    }
}
