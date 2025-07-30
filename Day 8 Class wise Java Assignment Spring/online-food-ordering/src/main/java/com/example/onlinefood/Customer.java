package com.example.onlinefood;

public class Customer {
    private String name;
    private String contactInfo;
    private String Address;

    public Customer(String name, String contactInfo, String Address) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return Address;
    }
}
