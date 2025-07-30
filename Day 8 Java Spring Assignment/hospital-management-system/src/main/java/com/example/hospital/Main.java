package com.example.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("balen.xml");
        HospitalService service = (HospitalService) context.getBean("hospitalService");
        service.operate();
    }
}
