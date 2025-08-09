package com.example.orderservicecs.service;

import com.example.orderservicecs.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> getAllOrders() {
        return List.of(
                new Order("Laptop", 70000.00, 2),
                new Order("Phone", 40000.00, 1),
                new Order("Tablet", 25000.00, 3)
        );
    }

    public Order getOrderById(Long id) {
        simulateProcessing(); // Adds delay for Zipkin trace
        return new Order("Sample Order", 500.00, 1);
    }

    private void simulateProcessing() {
        try {
            Thread.sleep(200); // Simulate slow processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
