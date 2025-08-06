package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Repräsentiert eine konkrete geometrische Figur: einen Kreis.
 * Erbt von der abstrakten Klasse Figur und implementiert deren Verträge.
 */

public class Kreis extends Figur {

    private final double radius;

    /**
     * Konstruktor für ein neues Kreis-Objekt.
     * Initialisiert einen Keis mit einer bestimmten Farbe und Radius.
     *
     * @param farbe Die Farbe des Kreises als String (z.B. "rot", "blau").
     * @param radius Die Länge des Kreises. Muss ein positiver Wert sein.
     */

    public Kreis(String farbe, double radius) {
        super(); // Ruft den Konstruktor der übergeordneten Klasse auf.
        this.farbe = farbe;
        this.radius = radius;
    }

    /**
     * Berechnet die Fläche des Kreises basierend auf seinem Radius.
     * Formel: PI*r^2
     * @return Die berechnete Fläche
     */
    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    /**
     * Berechnet den Umfang des Kreises basierend auf seinem Radius
     * Formel: 2*PI*r
     * @return Den berechneten Umfang
     */
    @Override
    public double berechneUmfang() {
        return 2*Math.PI * radius;
    }

    /**
     * Stellt dieses Kreis-Objekt als String dar, inklusive Fläche und Umfang.
     *
     * @return Eine formatierte Zeichenkette mit "Kreis", Fläche und Umfang.
     */
    @Override
    public String toString() {
        // Formatiert die Ausgabe, um Fläche und Umfang klar darzustellen, jeweils in einer neuen Zeile.
        return "Kreis \n" + "Fläche = " + berechneFlaeche() + "\nUmfang = " + berechneUmfang();
    }
}
