package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Repräsentiert eine konkrete geometrische Figur: ein Rechteck.
 * Erbt von der abstrakten Klasse Figur und implementiert deren Verträge.
 */

public class Rechteck extends Figur {
    private double laenge;
    private double breite;

    public Rechteck (String farbe, double laenge, double breite){
        super();
        this.farbe = farbe;
        this.laenge = laenge;
        this.breite = breite;
    }
    @Override
    public double berechneFlaeche(){
        return laenge * breite;
    }
    @Override
    public double berechneUmfang(){
        return 2*(laenge * breite);
    }
    @Override
    public String toString() {
        return "Rechteck \n" + "Fläche = " + berechneFlaeche() + "\nUmfang = " + berechneUmfang();
    }

}
