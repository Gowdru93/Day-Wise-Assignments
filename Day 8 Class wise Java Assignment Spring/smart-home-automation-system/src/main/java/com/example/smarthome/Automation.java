package com.example.smarthome;

import com.example.smarthome.Device;
import com.example.smarthome.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Automation {

    @Autowired
    private User user;

    @Autowired
    private Device device;

    public void controlDevice() {
    	System.out.println("==============================================");
        System.out.println("Smart Home Automation System");
        System.out.println("User: " + user.getName());
        System.out.println("Home ID: " + user.getHomeId());
        System.out.println("Device Type: " + device.getType());
        System.out.println("Device Initial Status: " + (device.isStatus() ? "ON" : "OFF"));

        System.out.println("Turning device ON...");
        device.turnOn();
        System.out.println("Device Status after turning ON: " + (device.isStatus() ? "ON" : "OFF"));

        System.out.println("Turning device OFF...");
        device.turnOff();
        System.out.println("Device Status after turning OFF: " + (device.isStatus() ? "ON" : "OFF"));

        System.out.println("==============================================");
    }
}
