package com.example.paymentservicecs.service;

import com.example.paymentservicecs.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment processPayment(String name, double price, int quantity) {
        simulateProcessing();
        return new Payment(name, price, quantity, "SUCCESS");
    }

    private void simulateProcessing() {
        try {
            Thread.sleep(300); // Simulate slow processing for Zipkin trace
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
