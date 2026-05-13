package de.rebelmetal.javaroad.principles.srp.refactored;

import de.rebelmetal.javaroad.principles.srp.refactored.OrderProcessor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OrderProcessorTest {

    private final OrderValidator validator = new OrderValidator();
    private final OrderRepository repository = new OrderRepository();
    private final OrderMailer mailer = new OrderMailer();

    private final OrderProcessor processor = new OrderProcessor(validator, repository, mailer);

    @Test
    void shouldRejectBlankOrderId() {
        assertThatThrownBy(() -> processor.processOrder("   ", 99.99))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Order ID");
    }

    @Test
    void shouldRejectNegativeOrderValue() {
        assertThatThrownBy(() -> processor.processOrder("ORD-001", -1.0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Order value");
    }

    @Test
    void shouldProcessValidOrder() {
        assertThatNoException().isThrownBy(() -> processor.processOrder("ORD-001", 99.99));
    }
}
