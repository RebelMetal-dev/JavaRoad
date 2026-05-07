package de.rebelmetal.javaroad.uebungen.streams_optional_vertiefung;

/**
 * Represents a customer order with a unique order number, customer name, and total amount.
 * <p>
 * Implemented as a {@code record} for automatic immutability,
 * {@code equals()}, {@code hashCode()}, and {@code toString()}.
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param bestellNr  the unique order number.
 * @param kundenName the name of the customer.
 * @param betrag     the total amount of the order.
 */
public record Bestellung(int bestellNr, String kundenName, double betrag) {}
