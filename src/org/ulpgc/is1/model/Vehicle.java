package org.ulpgc.is1.model;

public class Vehicle {
    private String plate;
    private String make;
    private String model;
    private Customer customer;

    public Vehicle(String plate, String make, String model, Customer customer) {
        this.plate = plate;
        this.make = make;
        this.model = model;
        this.customer = customer;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}