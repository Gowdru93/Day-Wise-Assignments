package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String type = "Smart Light";
    private boolean status = false;

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
        System.out.println(type + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(type + " is now OFF.");
    }
}
