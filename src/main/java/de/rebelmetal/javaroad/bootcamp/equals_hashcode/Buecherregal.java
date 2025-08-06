package de.rebelmetal.javaroad.bootcamp.equals_hashcode;


import java.sql.SQLOutput;
import java.util.*;

public class Buecherregal {

    public static void main(String[] args) {
        Set<Buch> einzigartigeBuecher = new HashSet<>();

        Buch buch1 = new Buch("978-3-16-148410-0", "Java: Die komplette Einführung");
        Buch buch2 = new Buch("978-3-16-148410-0", "Java: Die komplette Einführung (2. Auflage)");
        Buch buch3 = new Buch("974-3-16-177410-0", "Java: Effective Java (3.Auflage)");

        einzigartigeBuecher.add(buch1);
        einzigartigeBuecher.add(buch2);
        einzigartigeBuecher.add(buch3);


        System.out.println("Anzahl der einzigartigen Bücher im Regal: " + einzigartigeBuecher.size());
    }
}
