package de.rebelmetal.javaroad.principles.srp.violation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatNoException;

/**
 * Tests for the SRP violation example.
 *
 * These tests prove that OrderProcessor is doing too much —
 * validation, persistence, and notification are all tangled together.
 *
 * @author Christoph Breddin
 */
class OrderProcessorTest {

    private final OrderProcessor processor = new OrderProcessor();

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
        assertThatNoException()
                .isThrownBy(() -> processor.processOrder("ORD-001", 99.99));
    }
}