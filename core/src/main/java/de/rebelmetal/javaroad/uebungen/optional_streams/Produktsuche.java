package de.rebelmetal.javaroad.uebungen.optional_streams;

import java.util.*;

/**
 * Practice exercise 2 for Java 8+ Features: Streams & Optional.
 *
 * Goal: demonstrates searching for an element in a Stream and safely
 *       handling the result using Optional.
 *
 * Tasks:
 * 1. Define a product record for data storage.
 * 2. Use the Stream API to find the first product priced above 1000 euros.
 * 3. Handle the result (an Optional&lt;Produkt&gt;) safely — print either the
 *    product details or a "not found" message.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class Produktsuche {

    /**
     * A record representing a product with a name and a price.
     * Records are a concise way to create immutable data classes.
     *
     * @param name  the name of the product.
     * @param preis the price of the product.
     */
    public record Produkt(String name, double preis) {}

    public static void main(String[] args) {
        List<Produkt> produktkatalog = List.of(
                new Produkt("Laptop", 1299.99),
                new Produkt("Maus", 49.90),
                new Produkt("Tastatur", 89.95),
                new Produkt("Monitor", 349.50),
                new Produkt("High-End PC", 2499.00)
        );

        // Create a stream from the catalog to perform the search.
        Optional<Produkt> gefundenesProdukt = produktkatalog.stream()
                // Keep only products whose price exceeds 1000.00.
                .filter(produkt -> produkt.preis() > 1000.00)
                // Return the first matching element wrapped in an Optional.
                .findFirst();

        // ifPresentOrElse handles both cases (found / not found) in one concise expression.
        gefundenesProdukt.ifPresentOrElse(
                // Executed when a product is present.
                produkt -> System.out.println(String.format("Found: %s for %.2f.", produkt.name(), produkt.preis())),
                // Executed when the Optional is empty.
                () -> System.out.println("No product over 1000 euros found.")
        );
    }
}
