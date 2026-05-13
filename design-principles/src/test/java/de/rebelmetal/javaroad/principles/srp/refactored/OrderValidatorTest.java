package de.rebelmetal.javaroad.principles.srp.refactored;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderValidatorTest {

    private final   OrderValidator validator = new OrderValidator();

    @Test
    void shouldRejectBlankOrderId() {
        assertThatThrownBy(() -> validator.validate("   ", 99.99))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Order ID");
    }

    @Test
    void shouldRejectNegativeOrderValue() {
        assertThatThrownBy(() -> validator.validate("ORD-001", -1.0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Order value");
    }

    @Test
    void shouldAcceptValidInput() {
        assertThatNoException().isThrownBy(() -> validator.validate("ORD-001", 99.99));
        }
    }

