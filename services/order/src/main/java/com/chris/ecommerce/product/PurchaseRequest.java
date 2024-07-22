package com.chris.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;

@Validated
public record PurchaseRequest(

        @NotNull(message = "Product is required")
        Integer productId,

        @Positive(message = "Quantity is required")
        double quantity
) {
}