package com.example.onlinefood;

import java.util.Arrays;

public class Restaurant {
    private String name;
    private String location;
    private String[] cuisines;

    public Restaurant(String name, String location, String[] cuisines) {
        this.name = name;
        this.location = location;
        this.cuisines = cuisines;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String[] getCuisines() {
        return cuisines;
    }

    public boolean servesCuisine(String cuisine) {
        return Arrays.asList(cuisines).contains(cuisine);
    }
}
