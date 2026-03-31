package com.example.SpringEcom.Service;


import com.example.SpringEcom.Model.Order;
import com.example.SpringEcom.Model.OrderItem;
import com.example.SpringEcom.Model.dto.OrderRequest;
import com.example.SpringEcom.Model.dto.OrderResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        String orderId = "ORD" + UUID.randomUUID().toString().substring(0,8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(orderRequest.customerName());
        order.setEmail(orderRequest.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());
        List<OrderItem> orderItems= new ArrayList<>();

    }

    public List<OrderResponse> getAllOrdersResponses() {
        return null;
    }
}
