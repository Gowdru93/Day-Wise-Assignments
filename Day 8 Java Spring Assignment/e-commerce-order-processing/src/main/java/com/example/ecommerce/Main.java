package com.example.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EcommerceService service = context.getBean(EcommerceService.class);
        service.operate();
    }
}
