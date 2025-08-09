package com.example.paymentservicecs.controller;

import com.example.paymentservicecs.model.Payment;
import com.example.paymentservicecs.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    // POST endpoint for real payment processing
    @PostMapping
    public Payment makePayment(@RequestBody Payment paymentRequest) {
        return service.processPayment(
                paymentRequest.getName(),
                paymentRequest.getPrice(),
                paymentRequest.getQuantity()
        );
    }

    // GET endpoint for quick browser testing
    @GetMapping("/test")
    public Payment testPayment() {
        return service.processPayment("Test Product", 999.99, 1);
    }
}
