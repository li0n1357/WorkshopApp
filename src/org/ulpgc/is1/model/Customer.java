package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
public class Customer {

    private String name;
    private Phone phone;
    private List<Vehicle> vehicleList;
    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
        this.vehicleList = new ArrayList<>();
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
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
    public void addVehicle(Vehicle vehicle){
        if(!(vehicleList.contains(vehicle))) vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
                }
}