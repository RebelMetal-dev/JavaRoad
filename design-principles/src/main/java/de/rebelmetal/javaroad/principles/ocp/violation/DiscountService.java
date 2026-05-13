package de.rebelmetal.javaroad.principles.ocp.violation;

/**
 * INTENTIONAL OCP VIOLATION — do not use as a template.
 *
 * This class must be modified every time a new customer type is added.
 * Adding a new discount type requires changing existing, tested code.
 *
 * @author Christoph Breddin
 */
public class DiscountService {

    /**
     * Calculates the discounted price based on the customer type.
     *
     * @param price        the original price
     * @param customerType the type of customer (e.g. "REGULAR", "VIP")
     * @return the price after discount
     * @throws IllegalArgumentException if the customer type is unknown
     */
    public double applyDiscount(double price, String customerType) {
        return switch (customerType) {
            case "REGULAR" -> price * 0.95;
            case "VIP"     -> price * 0.80;
            default        -> throw new IllegalArgumentException(
                    "Unknown customer type: " + customerType);
        };
    }
}

