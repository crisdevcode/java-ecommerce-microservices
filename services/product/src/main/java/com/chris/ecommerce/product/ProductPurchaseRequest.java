package com.chris.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductPurchaseRequest(

        @NotNull(message = "Product is required")
        Integer productId,

        @Positive(message = "Quantity is required")
        double quantity
) {
}
