package de.rebelmetal.javaroad.principles.srp.refactored;

/**
 * Responsible solely for persisting orders to the database.
 *
 * Single responsibility: if the persistence strategy changes, only this class changes.
 *
 * @author Christoph Breddin
 */
public class OrderRepository {

    /**
     * Saves the given order to the database.
     *
     * @param orderId    the ID of the order to save
     * @param orderValue the monetary value of the order
     */
    public void save(String orderId, double orderValue) {
        System.out.println("Saving order " + orderId + " to database...");
    }
}