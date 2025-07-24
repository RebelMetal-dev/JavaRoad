package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Repräsentiert eine konkrete geometrische Figur: ein Rechteck.
 * Erbt von der abstrakten Klasse Figur und implementiert deren Verträge.
 */
public class Rechteck extends Figur {
    private final double laenge;
    private final double breite;


    /**
     * Konstruktor für ein neues Rechteck-Objekt.
     * Initialisiert ein neues, unveränderliches Rechteck mit einer bestimmten Farbe, Länge und Breite.
     * Nach der Erstellung sind die Dimensionen unveränderlich.
     *
     * @param farbe Die Farbe des Rechtecks als String (z.B. "rot", "blau").
     * @param laenge Die Länge des Rechtecks. Muss ein positiver Wert sein.
     * @param breite Die Breite des Rechtecks. Muss ein positiver Wert sein.
     */
    public Rechteck (String farbe, double laenge, double breite){
        super(); // Ruft den Konstruktor der Superklasse auf, um die Figur zu initialisieren.
        this.farbe = farbe;
        this.laenge = laenge; // Initialisiert die feste Länge.
        this.breite = breite; // Initialisiert die feste Breite.
    }

    /**
     * Berechnet die Fläche des Rechteck basierend auf seiner Länge und Breite
     * Formel: Länge * Breite
     *
     * @return Die berechnete Fläche
     */
    @Override
    public double berechneFlaeche(){
        return laenge * breite;
    }

    /**
     * Berechnet den Umfang des Rechteck basierend auf seiner Länge und Breite
     * Formel: 2*(Länge + Breite)
     *
     * @return Den berechneten Umfang
     */
    @Override
    public double berechneUmfang(){
        return 2*(laenge + breite);
    }

    /**
     * Stellt dieses Rechteck-Objekt als String dar, inklusive Fläche und Umfang.
     *
     * @return Eine formatierte Zeichenkette mit "Rechteck", Fläche und Umfang.
     */
    @Override
    public String toString() {
        // Formatiert die Ausgabe, um Fläche und Umfang klar darzustellen, jeweils in einer neuen Zeile.
        return "Rechteck \n" + "Fläche = " + berechneFlaeche() + "\nUmfang = " + berechneUmfang();
    }

}
