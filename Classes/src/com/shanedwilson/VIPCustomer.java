package com.shanedwilson;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer() {
        this("shane", 100.00, "me@shanedwilson.com");
    }

    public VIPCustomer(String name, String email) {
        this(name, 150.00, email);
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
