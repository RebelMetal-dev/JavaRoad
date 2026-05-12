package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

/**
 * Test class demonstrating the functionality of {@link Drucker} and {@link FarbDrucker}.
 * Shows method overloading and runtime polymorphism in a printing context.
 */
public class DruckerTest {

    public static void main(String[] args) {

        // Creates an instance of the standard printer.
        Drucker meinDrucker = new Drucker();
        meinDrucker.drucken("ene menen popel");   // Standard print.
        meinDrucker.drucken("LEtz Fetz", -1);     // Tests error handling for negative count.
        meinDrucker.drucken(33);                  // Prints an integer.

        // Creates an instance of the color printer with a specific color code.
        FarbDrucker meinFarbDrucker = new FarbDrucker("Ansi-Yellow");
        // Demonstrates the overridden print behavior of the color printer.
        meinFarbDrucker.drucken("Veni Vidi Vici");

        // Demonstrates polymorphism: a FarbDrucker object is treated as a Drucker.
        // The FarbDrucker's drucken() method is still called correctly (runtime polymorphism).
        Drucker polyDrucker = new FarbDrucker("Ansi-Red");
        polyDrucker.drucken("Veni Vidi Vici");
    }
}
