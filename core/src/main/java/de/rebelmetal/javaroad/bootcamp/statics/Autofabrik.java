package de.rebelmetal.javaroad.bootcamp.statics;

/**
 * Interactive exercise for understanding {@code static} vs. instance members.
 *
 * Simulates a car factory and a single car to demonstrate the difference
 * between class-level (static) and object-level (instance) properties and behavior.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class Autofabrik {

    // --- 1. Instance field (belongs to the OBJECT) ---
    /**
     * The color of this specific car. Each car object (each instance)
     * gets its own independent copy of this field.
     */
    private String farbe;

    // --- 2. Static field (belongs to the CLASS) ---
    /**
     * Counts the total number of cars ever produced in this factory.
     * This field exists only ONCE and is shared across all instances.
     */
    public static int produzierteAutosCounter = 0;

    // --- 3. Constructor (connects both worlds) ---
    /**
     * Creates a new car object (an instance).
     * Called every time {@code new Autofabrik()} is used.
     *
     * @param farbe the color for THIS specific new car.
     */
    public Autofabrik(String farbe) {
        // 'this.farbe' refers to the field of the object being created.
        // We set the individual property of this instance.
        this.farbe = farbe;

        // Increment the ONE shared class-level counter.
        produzierteAutosCounter++;

        System.out.println("New car produced! Color: " + this.farbe +
                ". Total production: " + produzierteAutosCounter);
    }

    // --- 4. Instance method (behavior of an OBJECT) ---
    /**
     * Returns the individual color of THIS car.
     * Requires a concrete object to be called on.
     *
     * @return the color of this car.
     */
    public String getFarbe() {
        return this.farbe;
    }

    // --- 5. Static method (behavior of the CLASS) ---
    /**
     * Prints general factory status information.
     * Can be called without creating an object.
     */
    public static void zeigeFabrikStatus() {
        System.out.println("--- Factory Status ---");
        System.out.println("Total cars produced: " + produzierteAutosCounter);

        // The following line would cause a compile error: a static method has no 'this'
        // and therefore cannot access instance fields like 'farbe'.
        // System.out.println("Color of last car: " + this.farbe);
    }

    public static void main(String[] args) {
        System.out.println("--- Production Start ---");
        Autofabrik.zeigeFabrikStatus();
        System.out.println("------------------------\n");

        System.out.println("Producing first car...");
        Autofabrik auto1 = new Autofabrik("Red");

        System.out.println("\nProducing second car...");
        Autofabrik auto2 = new Autofabrik("Blue");

        System.out.println("\n--- Production End ---");
        Autofabrik.zeigeFabrikStatus();

        System.out.println("Color of car 1: " + auto1.getFarbe());
        System.out.println("Color of car 2: " + auto2.getFarbe());
    }
}
