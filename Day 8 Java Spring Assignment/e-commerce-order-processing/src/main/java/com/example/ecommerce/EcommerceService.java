package com.example.ecommerce;

public class EcommerceService {
    private final Product product;
    private final Order order;
    private final Payment payment;

    public EcommerceService(Product product, Order order, Payment payment) {
        this.product = product;
        this.order = order;
        this.payment = payment;
    }

    public void operate() {
        product.addProduct();
        product.listProducts();

        order.createOrder();
        order.cancelOrder();

        payment.processPayment();
        payment.refundPayment();
    }
}
