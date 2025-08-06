package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Abstrakte Basisklasse für alle geometrischen Figuren.
 *
 * Definiert die gemeinsamen Eigenschaften und Verträge, die jede Figur erfüllen muss.
 * Eine Figur kann nicht direkt instanziiert werden.
 *
 * @author Christoph Breddin
 * @version 1.0
 */

public abstract class Figur {
    // Die Farbe der Figur. 'protected', damit Subklassen direkt darauf zugreifen können.
    protected String farbe;

    /**
     * Standardkonstruktor für Figur-Objekte.
     * Initialisiert eine Figur ohne spezifische Farbe.
     */
    public Figur() {
        // Standardinitialisierung, keine Parameter.
    }

    /**
     * Konstruktor für Figur-Objekte mit definierter Farbe.
     *
     * @param farbe Die Farbe der Figur.
     */
    public Figur(String farbe) {
        this.farbe = farbe; // Weist die übergebene Farbe der Instanzvariablen zu.
    }

    /**
     * Gibt die Farbe der Figur zurück.
     *
     * @return Die Farbe der Figur.
     */
    public String getFarbe(){
        return this.farbe; // Korrekte Rückgabe der Instanzvariablen
    }

    /**
     * Abstrakte Methode zur Berechnung der Fläche der Figur.
     * Muss von allen konkreten Subklassen implementiert werden.
     *
     * @return Die berechnete Fläche der Figur.
     */
    public abstract double berechneFlaeche();


    /**
     * Abstrakte Methode zur Berechnung des Umfangs der Figur.
     * Muss von allen konkreten Subklassen implementiert werden.
     *
     * @return Der berechnete Umfang der Figur.
     */
    public abstract double berechneUmfang();
}
