package de.rebelmetal.javaroad.principles.srp.refactored;

/**
 * Orchestrates the order processing workflow by delegating to
 * single-responsibility collaborators.
 *
 * This class has exactly one reason to change: if the order processing
 * workflow itself changes (e.g. a new step is added or removed).
 *
 * Interview one-liner: "I applied SRP by splitting a class with three
 * reasons to change into four classes, each with exactly one responsibility."
 *
 * @author Christoph Breddin
 */
public class OrderProcessor {

    private final OrderValidator validator;
    private final OrderRepository repository;
    private final OrderMailer mailer;

    /**
     * Creates an OrderProcessor with the given collaborators.
     *
     * @param validator  validates order input
     * @param repository persists the order
     * @param mailer     sends the confirmation email
     */
    public OrderProcessor(OrderValidator validator,
                          OrderRepository repository,
                          OrderMailer mailer) {
        this.validator = validator;
        this.repository = repository;
        this.mailer = mailer;
    }

    /**
     * Processes an order by validating, saving, and notifying.
     *
     * @param orderId    the ID of the order to process
     * @param orderValue the monetary value of the order
     */
    public void processOrder(String orderId, double orderValue) {
        validator.validate(orderId, orderValue);
        repository.save(orderId, orderValue);
        mailer.sendConfirmation(orderId);
    }
}