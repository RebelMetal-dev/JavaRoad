package de.rebelmetal.javaroad.principles.ocp.violation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DiscountServiceTest {
    private final DiscountService discountService = new DiscountService();

    @Test
    void shouldApplyRegularDiscount() {
        double result = discountService.applyDiscount(100.0, "REGULAR");
        assertThat(result).isEqualTo(95.0);
    }

    @Test
    void shouldApplyVipDiscount() {
        double result = discountService.applyDiscount(100.0, "VIP");
        assertThat(result).isEqualTo(80.0);
    }

    @Test
    void shouldRejectUnknownCustomerType() {
        assertThatThrownBy(() -> discountService.applyDiscount(100.0, "UNKNOWN"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Unknown customer type");
    }

}
