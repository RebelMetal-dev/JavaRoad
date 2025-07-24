package de.rebelmetal.javaroad.bootcamp.vererbung;

import java.util.ArrayList;
import java.util.List;

public class FigurenTest {

    public static void main(String[] args) {
        Kreis meinKreis = new Kreis("gelb", 13.7);
        Rechteck meinRechteck = new Rechteck ("rot", 15,8.7);

        List<Figur> figurenListe = new ArrayList<>();
        figurenListe.add(meinKreis);
        figurenListe.add(meinRechteck);

        for (Figur figur : figurenListe) {
            System.out.println("Fläche: " + figur.berechneFlaeche());
        }



    }
}
