package com.example.SpringEcom.Model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        String product,
        int quantity,
        BigDecimal TotalPrice
) {
}
