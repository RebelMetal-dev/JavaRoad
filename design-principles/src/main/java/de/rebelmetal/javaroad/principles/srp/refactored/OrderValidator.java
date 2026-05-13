package de.rebelmetal.javaroad.principles.srp.refactored;

/**
 * Responsible solely for validating order input data.
 *
 * Single responsibility: if validation rules change, only this class changes.
 *
 * @author Christoph Breddin
 */
public class OrderValidator {

    /**
     * Validates the given order parameters.
     *
     * @param orderId    the order ID to validate
     * @param orderValue the order value to validate
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public void validate(String orderId, double orderValue) {
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID must not be blank");
        }
        if (orderValue <= 0) {
            throw new IllegalArgumentException("Order value must be positive");
        }
    }
}