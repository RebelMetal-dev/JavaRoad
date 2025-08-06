package de.rebelmetal.javaroad.bootcamp.vererbung;

import java.util.ArrayList;
import java.util.List;

public class FigurenTest {

    public static void main(String[] args) {
        // Erzeugt Instanzen von Kreis und Rechteck mit spezifischen Eigenschaften.
        Kreis meinKreis = new Kreis("gelb", 13.7);
        Rechteck meinRechteck = new Rechteck ("rot", 15,8.7);

        // Gibt die Details des Kreises direkt aus.
        // Beachte: Direkter Zugriff auf 'farbe' setzt voraus, dass dieses Feld in 'Figur' zugänglich ist.
        System.out.println(meinKreis.farbe + "\n" + meinKreis.berechneFlaeche() + "\n" + meinKreis.berechneUmfang());
        System.out.println(); // Leerzeile zur besseren Trennung der Ausgaben.
        System.out.println(meinRechteck.farbe + "\n" + meinRechteck.berechneFlaeche() + "\n" + meinRechteck.berechneUmfang());
        System.out.println();

        // Erstellt eine Liste vom Typ 'Figur', um verschiedene Formen polymorph zu speichern.
        List<Figur> figurenListe = new ArrayList<>();
        figurenListe.add(meinKreis);
        figurenListe.add(meinRechteck);

        // Iteriert durch die Liste und gibt die Fläche jeder Figur aus.
        // Dies demonstriert die polymorphe Eigenschaft der 'berechneFlaeche()'-Methode.
        for (Figur figur : figurenListe) {
            System.out.println("Fläche: " + figur.berechneFlaeche());
        }



    }
}
