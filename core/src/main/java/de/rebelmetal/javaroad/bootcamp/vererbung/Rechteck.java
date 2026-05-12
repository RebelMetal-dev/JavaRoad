package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Represents a concrete geometric shape: a rectangle.
 * Inherits from the abstract class {@link Figur} and implements its contracts.
 */
public class Rechteck extends Figur {

    private final double laenge;
    private final double breite;

    /**
     * Creates a new Rechteck object.
     * Dimensions are immutable after construction.
     *
     * @param farbe  the color of the rectangle (e.g. "red", "blue").
     * @param laenge the length of the rectangle. Must be a positive value.
     * @param breite the width of the rectangle. Must be a positive value.
     */
    public Rechteck(String farbe, double laenge, double breite) {
        super(); // Calls the parent class constructor.
        this.farbe = farbe;
        this.laenge = laenge;
        this.breite = breite;
    }

    /**
     * Calculates the area of this rectangle.
     * Formula: length * width
     *
     * @return the calculated area.
     */
    @Override
    public double berechneFlaeche() {
        return laenge * breite;
    }

    /**
     * Calculates the perimeter of this rectangle.
     * Formula: 2 * (length + width)
     *
     * @return the calculated perimeter.
     */
    @Override
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    /**
     * Returns a string representation of this rectangle, including area and perimeter.
     *
     * @return a formatted string with shape type, area, and perimeter.
     */
    @Override
    public String toString() {
        return "Rectangle\nArea = " + berechneFlaeche() + "\nPerimeter = " + berechneUmfang();
    }
}
