package de.rebelmetal.javaroad.bootcamp.vererbung;

import java.util.ArrayList;
import java.util.List;

public class FigurenTest {

    public static void main(String[] args) {
        // Create instances of Kreis and Rechteck with specific properties.
        Kreis meinKreis = new Kreis("yellow", 13.7);
        Rechteck meinRechteck = new Rechteck("red", 15, 8.7);

        // Print the details of the circle directly.
        // Note: direct access to 'farbe' requires the field to be accessible in Figur (protected).
        System.out.println(meinKreis.farbe + "\n" + meinKreis.berechneFlaeche() + "\n" + meinKreis.berechneUmfang());
        System.out.println();
        System.out.println(meinRechteck.farbe + "\n" + meinRechteck.berechneFlaeche() + "\n" + meinRechteck.berechneUmfang());
        System.out.println();

        // Create a List<Figur> to store different shapes polymorphically.
        List<Figur> figurenListe = new ArrayList<>();
        figurenListe.add(meinKreis);
        figurenListe.add(meinRechteck);

        // Iterate through the list and print the area of each shape.
        // This demonstrates the polymorphic behavior of berechneFlaeche().
        for (Figur figur : figurenListe) {
            System.out.println("Area: " + figur.berechneFlaeche());
        }
    }
}
