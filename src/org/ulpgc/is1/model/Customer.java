package org.ulpgc.is1.model;

public class Customer {
    private String name;
    private Phone phone;

    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public static Customer createCustomer(String name, String phoneNumber) {
        Phone phone = new Phone(phoneNumber);
        return new Customer(name, phone);
    }
}

