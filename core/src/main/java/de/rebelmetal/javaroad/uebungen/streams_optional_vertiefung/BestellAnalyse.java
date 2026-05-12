package de.rebelmetal.javaroad.uebungen.streams_optional_vertiefung;

import java.util.List;
import java.util.Optional;

/**
 * Demonstrates using Java Streams and Optional to analyze a list of customer orders.
 * Shows how to filter, transform, and aggregate data to answer specific business questions.
 * <p>
 * Concrete use cases: calculating total revenue above a threshold, and finding the
 * first matching order based on multiple criteria.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class BestellAnalyse {

    public static void main(String[] args) {

        List<Bestellung> bestellungen = List.of(
                new Bestellung(101, "Anna", 89.90),
                new Bestellung(102, "Peter", 1200.50),
                new Bestellung(103, "Chris", 45.00),
                new Bestellung(104, "Maria", 2500.00),
                new Bestellung(105, "Anna", 150.25)
        );

        // Threshold defined as a variable to avoid magic numbers and centralize changes.
        double mindestBetragFuerFilter = 1000.00;

        // Calculates total revenue for orders above the threshold.
        // The stream is filtered to keep only relevant orders,
        // then mapped to amounts for direct summation.
        double gesamtUmsatzUeberTausend = bestellungen.stream()
                .filter(bestellung -> bestellung.betrag() > mindestBetragFuerFilter)
                .mapToDouble(Bestellung::betrag)
                .sum();

        // Formats the output for consistent display of currency amounts.
        System.out.println(String.format(
                "Total revenue for orders above %.2f: %.2f",
                mindestBetragFuerFilter,
                gesamtUmsatzUeberTausend
        ));

        // Search criteria for the first matching order.
        String gesuchterKundenName = "Anna";
        double gesuchterBetragFuerFilter = 100.00;

        // Searches for the first order matching both criteria.
        // findFirst() returns an Optional to express that no result may be found,
        // avoiding NullPointerExceptions.
        Optional<Bestellung> gefundeneBestellungVonKunden = bestellungen.stream()
                .filter(bestellung -> bestellung.kundenName().equals(gesuchterKundenName))
                .filter(bestellung -> bestellung.betrag() > gesuchterBetragFuerFilter)
                .findFirst();

        // ifPresentOrElse handles both cases (found / not found) concisely and safely.
        gefundeneBestellungVonKunden.ifPresentOrElse(
                // This block runs only when an order was found — gives direct access to it.
                bestellung -> System.out.println(String.format(
                        "Found: order %d with an amount of %.2f.",
                        bestellung.bestellNr(),
                        bestellung.betrag()
                )),
                // This block runs when no matching order was found.
                () -> System.out.println("No matching order found for " + gesuchterKundenName + ".")
        );
    }
}
