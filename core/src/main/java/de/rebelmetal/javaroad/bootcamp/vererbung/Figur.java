package de.rebelmetal.javaroad.bootcamp.vererbung;

/**
 * Abstract base class for all geometric shapes.
 *
 * Defines the shared properties and contracts that every concrete shape must fulfill.
 * A Figur cannot be instantiated directly.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public abstract class Figur {

    // The color of the shape. 'protected' so subclasses can access it directly.
    protected String farbe;

    /**
     * Default constructor for Figur objects.
     * Initializes a shape without a specific color.
     */
    public Figur() {
        // Default initialization, no parameters required.
    }

    /**
     * Constructor for Figur objects with a defined color.
     *
     * @param farbe the color of the shape.
     */
    public Figur(String farbe) {
        this.farbe = farbe;
    }

    /**
     * Returns the color of this shape.
     *
     * @return the color of this shape.
     */
    public String getFarbe() {
        return this.farbe;
    }

    /**
     * Abstract method for calculating the area of this shape.
     * Must be implemented by all concrete subclasses.
     *
     * @return the calculated area.
     */
    public abstract double berechneFlaeche();

    /**
     * Abstract method for calculating the perimeter of this shape.
     * Must be implemented by all concrete subclasses.
     *
     * @return the calculated perimeter.
     */
    public abstract double berechneUmfang();
}
