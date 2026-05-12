package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Represents a concrete geometric shape: a circle.
 * Inherits from the abstract class {@link Figur} and implements its contracts.
 */
public class Kreis extends Figur {

    private final double radius;

    /**
     * Creates a new Kreis object.
     *
     * @param farbe  the color of the circle (e.g. "red", "blue").
     * @param radius the radius of the circle. Must be a positive value.
     */
    public Kreis(String farbe, double radius) {
        super(); // Calls the parent class constructor.
        this.farbe = farbe;
        this.radius = radius;
    }

    /**
     * Calculates the area of this circle.
     * Formula: PI * r²
     *
     * @return the calculated area.
     */
    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of this circle.
     * Formula: 2 * PI * r
     *
     * @return the calculated perimeter.
     */
    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of this circle, including area and perimeter.
     *
     * @return a formatted string with shape type, area, and perimeter.
     */
    @Override
    public String toString() {
        return "Circle\nArea = " + berechneFlaeche() + "\nPerimeter = " + berechneUmfang();
    }
}
