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

    /**
     * Der Einstiegspunkt der Anwendung.
     * Demonstriert die Stream-Operationen anhand einer festen Liste von Städten.
     *
     */

    public static void main(String[] args) {

        // -- SETUP: Erstellen unserer Beispieldaten --
        List<String> staedte = List.of("Berlin", "München", "Hamburg", "Köln", "Frankfurt", "Bremen");

        // -- AUFGABE 1: Filtern --
        // Wir erstellen einen Stream aus der Liste, filtern alle Elemente heraus,
        // die nicht mit "B" beginnen, und sammeln das Ergebnis in einer neuen Liste.
        List<String> bStaedte = staedte.stream()
                .filter(stadt -> stadt.startsWith("B"))
                .toList(); // .toList() ist eine moderne, kurze Alternative zu .collect(Collectors.toList())
        System.out.println("Städte, die mit 'B' beginnen: " + bStaedte);


        // -- AUFGABE 2: Transformieren (Mapping) --
        // Wir erstellen einen Stream, wandeln jeden Stadt-String in seine Länge (einen Integer) um
        // und sammeln diese Längen in einer neuen Liste von Integers.
        List<Integer> namenLaengen = staedte.stream()
                .map(String::length)
                .toList();
        System.out.println("Längen der Stadtnamen: " + namenLaengen);


        // -- AUFGABE 3: Filtern und Transformieren kombiniert --
        // Wir verketten die Operationen: Zuerst filtern wir die langen Namen,
        // DANN wandeln wir die verbleibenden Elemente in Großbuchstaben um
        // und sammeln das Endergebnis in einer neuen Liste.
        List<String> langeStaedteGross = staedte.stream()
                .filter(stadt -> stadt.length() > 6)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Lange Städtenamen in Großbuchstaben: " + langeStaedteGross);
    }
}