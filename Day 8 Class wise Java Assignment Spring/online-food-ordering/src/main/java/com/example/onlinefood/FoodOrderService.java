package com.example.onlinefood;

import com.example.onlinefood.Customer;
import com.example.onlinefood.Restaurant;

public class FoodOrderService {
    private Customer customer;
    private Restaurant restaurant;

    public FoodOrderService(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void placeOrder() {
        System.out.println("Customer: " + customer.getName() + " wants " + customer.getAddress() + " food.");
        if (restaurant.servesCuisine(customer.getAddress())) {
            System.out.println("Order placed at " + restaurant.getName() + " located at " + restaurant.getLocation());
        } else {
            System.out.println("Sorry, no restaurant available that serves " + customer.getAddress());
        }
    }
}
