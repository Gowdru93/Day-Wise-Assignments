package com.example.onlinefood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer("Rakshith", "rakshith@gmail.com", "South Indian");
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant("Udupi Hotel", "Bangalore", new String[]{"South Indian", "North Indian"});
    }

    @Bean
    public FoodOrderService foodOrderService() {
        return new FoodOrderService(customer(), restaurant());
    }
}