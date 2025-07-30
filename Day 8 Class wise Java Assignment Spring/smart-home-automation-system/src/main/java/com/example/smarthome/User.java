package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Rakshith";
    private String homeId = "RGS";

    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }
}
