package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

/**
 * A base class that can print different types of data.
 *
 * This class demonstrates the concept of method overloading by providing
 * multiple {@code print} methods with different parameter lists.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class Drucker {

    /**
     * Prints a text string with a standard prefix.
     *
     * @param text the string to print.
     */
    public void drucken(String text) {
        System.out.println("Standard print: " + text);
    }

    /**
     * Prints a text string multiple times.
     * Ignores negative values for {@code anzahl} and prints an error message instead.
     *
     * @param text   the string to print.
     * @param anzahl the number of repetitions. Must be zero or positive.
     */
    public void drucken(String text, int anzahl) {
        // Reject negative repetition counts before entering the loop.
        if (anzahl < 0) {
            System.out.println("Error: repetition count cannot be negative.");
            return;
        }
        for (int i = 0; i < anzahl; i++) {
            System.out.println(text);
        }
    }

    /**
     * Prints an integer with a descriptive prefix.
     *
     * @param zahl the integer to print.
     */
    public void drucken(int zahl) {
        System.out.println("Printing number: " + zahl);
    }
}
