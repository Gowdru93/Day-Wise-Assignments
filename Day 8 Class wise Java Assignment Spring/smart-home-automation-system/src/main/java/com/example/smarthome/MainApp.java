package com.example.smarthome;

import com.example.smarthome.AppConfig;
import com.example.smarthome.Automation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Automation automationService = context.getBean(Automation.class);
        automationService.controlDevice();
    }
}
