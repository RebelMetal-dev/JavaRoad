package de.rebelmetal.javaroad.uebungen.streams_lambdas;
import java.util.List;


/**
 * Praktische Übung 1 zu den Java 8+ Features: Streams & Lambdas.
 *
 * Ziel: Demonstriert die grundlegende Anwendung von Stream-Operationen
 *       zur Filterung und Transformation von Daten in einer Collection.
 *
 * Aufgaben:
 * 1. Filtere eine Liste von Städten, um nur die zu finden, die mit 'B' beginnen.
 * 2. Transformiere eine Liste von Städten in eine Liste ihrer Namenslängen (Integer).
 * 3. Kombiniere Filterung und Transformation: Finde Städte mit mehr als 6 Buchstaben
 *    und wandle ihre Namen in Großbuchstaben um.
 *
 * @author Christoph Breddin
 * @version 1.0
 */

public class Datenverarbeitung {

    public static void main(String[] args) {


        List<String> staedte = List.of("Berlin", "München", "Hamburg", "Köln", "Frankfurt", "Bremen");
        List<String> bStaedte = staedte.stream()
                .filter(stadt ->stadt.startsWith("B"))
                .toList();
        System.out.println("Städte, die mit 'B' beginnen: " + bStaedte);


        List<Integer> namenLaengen = staedte.stream()
                .map(String::length)
                  .toList();
        System.out.println("Längen der Stadtnamen: " + namenLaengen);


        List<String> langeStaedteGross = staedte.stream()
                .filter(stadt -> stadt.length()>6)
                .map(String::toUpperCase
                )
                .toList();
        System.out.println("Lange Städtenamen in Großbuchstaben: " + langeStaedteGross);



    }
}