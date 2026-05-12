package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

/**
 * A specialized printer that prints in color.
 *
 * Inherits from {@link Drucker} and demonstrates method overriding by
 * specializing the behavior of the {@code drucken(String)} method.
 */
public class FarbDrucker extends Drucker {

    // The immutable color code used for all print operations of this instance.
    private final String farbCode;

    /**
     * Creates a new FarbDrucker with the given color code.
     * The color code cannot be changed after construction.
     *
     * @param farbCode the color code string (e.g. hex code or color name) for this printer.
     */
    public FarbDrucker(String farbCode) {
        // Implicitly calls the default constructor of the parent class Drucker.
        this.farbCode = farbCode;
    }

    /**
     * Overrides the standard print method to include this printer's color code in the output.
     *
     * @param text the string to print to the console.
     */
    @Override
    public void drucken(String text) {
        System.out.println("Color print (" + farbCode + "): " + text);
    }
}
