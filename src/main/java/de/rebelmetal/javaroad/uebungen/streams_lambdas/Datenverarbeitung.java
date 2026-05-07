package de.rebelmetal.javaroad.uebungen.streams_lambdas;

import java.util.List;

/**
 * Practice exercise 1 for Java 8+ Features: Streams & Lambdas.
 *
 * Goal: demonstrates the basic use of Stream operations to filter
 *       and transform data in a collection.
 *
 * Tasks:
 * 1. Filter a list of cities to find only those starting with 'B'.
 * 2. Transform a list of cities into a list of their name lengths (Integer).
 * 3. Combine filtering and transformation: find cities with more than 6 characters
 *    and convert their names to uppercase.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class Datenverarbeitung {

    /**
     * Application entry point.
     * Demonstrates Stream operations on a fixed list of cities.
     */
    public static void main(String[] args) {

        // SETUP: create our sample data.
        List<String> staedte = List.of("Berlin", "München", "Hamburg", "Köln", "Frankfurt", "Bremen");

        // TASK 1: Filtering
        // Stream the list, filter out all elements that do not start with "B",
        // and collect the result into a new list.
        List<String> bStaedte = staedte.stream()
                .filter(stadt -> stadt.startsWith("B"))
                .toList(); // .toList() is a concise modern alternative to .collect(Collectors.toList())
        System.out.println("Cities starting with 'B': " + bStaedte);

        // TASK 2: Transformation (Mapping)
        // Stream the list, map each city string to its character count (an Integer),
        // and collect those counts into a new list.
        List<Integer> namenLaengen = staedte.stream()
                .map(String::length)
                .toList();
        System.out.println("City name lengths: " + namenLaengen);

        // TASK 3: Combined Filtering and Transformation
        // Chain the operations: first filter for long names,
        // THEN convert the remaining elements to uppercase,
        // and collect the final result into a new list.
        List<String> langeStaedteGross = staedte.stream()
                .filter(stadt -> stadt.length() > 6)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Long city names in uppercase: " + langeStaedteGross);
    }
}
