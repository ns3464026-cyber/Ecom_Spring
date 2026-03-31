package com.example.SpringEcom.Model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {

}
