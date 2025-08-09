package com.example.paymentservicecs.model;

public class Payment {
    private final String name;
    private final double price;
    private final int quantity;
    private final String status;

    public Payment(String name, double price, int quantity, String status) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getStatus() {
		return status;
	}
    

}
