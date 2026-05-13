package de.rebelmetal.javaroad.principles.srp.refactored;

/**
 * Responsible solely for sending order confirmation emails.
 *
 * Single responsibility: if the email provider changes, only this class changes.
 *
 * @author Christoph Breddin
 */
public class OrderMailer {

    /**
     * Sends a confirmation email for the given order.
     *
     * @param orderId the ID of the order to confirm
     */
    public void sendConfirmation(String orderId) {
        System.out.println("Sending confirmation email for order " + orderId + "...");
    }
}
