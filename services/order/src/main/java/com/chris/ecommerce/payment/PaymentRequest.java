package com.chris.ecommerce.payment;

import com.chris.ecommerce.customer.CustomerResponse;
import com.chris.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
