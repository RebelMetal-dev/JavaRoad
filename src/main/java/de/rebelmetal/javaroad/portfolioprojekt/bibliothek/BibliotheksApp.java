package de.rebelmetal.javaroad.portfolioprojekt.bibliothek;

import java.util.HashSet;
import java.util.List;

public class BibliotheksApp {

    public static void main(String[] args) {

        Bibliothek bibliothek1 = new Bibliothek(new HashSet<>());

        bibliothek1.buchHinzufuegen(new Buch("978-3-608-98800-0", "Herr der Ringe","Tolkien, John R. R."));
        bibliothek1.buchHinzufuegen(new Buch("978-3-86647-325-6", "Das Kaptital","Marx, Karl"));
        bibliothek1.buchHinzufuegen(new Buch("978-3-7577-0089-8", "40 Jahre Der Hexer","Hohlbein, Wolfgang"));
        bibliothek1.buchHinzufuegen(new Buch("978-3-7306-0277-5", "Die göttliche Komödie","Dante Alighieri"));
        bibliothek1.buchHinzufuegen(new Buch("978-3-453-53494-0", "Die Elfen (Prachtausgabe)","Hennen, Bernhard , Sullivan, James A."));

        bibliothek1.findeBuchNachIsbn("978-3-608-98800-0").ifPresentOrElse(
                buch -> System.out.printf("Das Buch %s von %s wurde gefunden.", buch.titel(), buch.autor()),
                () -> System.err.println("Buch nicht gefunden"));


        bibliothek1.findeBuchNachIsbn("978-3-608-98800-1").ifPresentOrElse(
                buch -> System.out.printf("Das Buch %s von %s wurde gefunden.%n", buch.titel(), buch.autor()),
                () -> System.err.println("Buch nicht gefunden"));

        System.out.println("");
        List<Buch> alleBuecher = bibliothek1.findeAlleBuecher();
        System.out.println(alleBuecher);
    }

}
