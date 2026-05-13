package de.rebelmetal.javaroad.principles.srp.violation;

/**
 * INTENTIONAL SRP VIOLATION — do not use as a template.
 *
 * This class handles order validation, database persistence, and email
 * notification all in one place. It has three reasons to change:
 * validation rules, persistence strategy, and notification format.
 *
 * @author Christoph Breddin
 */

public class OrderProcessor {

    /**
     * Processes an order by validating, saving, and notifying — all in one method.
     *
     * @param orderId    the ID of the order to process
     * @param orderValue the monetary value of the order
     */
    public void processOrder(String orderId, double orderValue) {
        //Responsibility 1: Validation
        if(orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID must not be blank");
        }
        if (orderValue<= 0) {
            throw new IllegalArgumentException("Order value must be positive");
        }

        // Responsibility 2: Persistance
        System.out.println("Saving order" + orderId + " to database...");

        // Responsibility 3: Notification
        System.out.println("Sending confirmation email for order " + orderId + "...");
    }
}
