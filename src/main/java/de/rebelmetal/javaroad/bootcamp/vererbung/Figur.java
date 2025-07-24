package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Abstrakte Basisklasse für alle geometrischen Figuren.
 *
 * Definiert die gemeinsamen Eigenschaften und Verträge, die jede Figur erfüllen muss.
 * Eine Figur kann nicht direkt instanziiert werden.
 *
 * @author Dein Name
 * @version 1.0
 */

public abstract class Figur {
    protected String farbe;

    public Figur() {

    }

    public Figur(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe(String farbe){
        return farbe;
    }

    public abstract double berechneFlaeche();

    public abstract double berechneUmfang();
}
