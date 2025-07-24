package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Repräsentiert eine konkrete geometrische Figur: einen Kreis.
 * Erbt von der abstrakten Klasse Figur und implementiert deren Verträge.
 */

public class Kreis extends Figur {

    private double radius;

    public Kreis(String farbe, double radius) {
                    super();
                    this.farbe = farbe;
                    this.radius = radius;
                }
    @Override
    public double berechneFlaeche() {
        return Math.PI * radius*radius;
    }
    @Override
    public double berechneUmfang() {
        return 2*Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Kreis \n" + "Fläche = " + berechneFlaeche() + "\nUmfang = " + berechneUmfang();
    }
}
