package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairManager {
    private List<SparePart> spareParts = new ArrayList<>();
    private List<Mechanic> mechanic = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Repair> repairs = new ArrayList<>();

    private Payment payment;

    public RepairManager() {
    }

    public void addMechanic(String name, String surname) {
        Mechanic mechanic1 = new Mechanic(name, surname);
        mechanic.add(mechanic1);
    }

    public List<Mechanic> getMechanic() {
        return new ArrayList<>(this.mechanic);
    }

    public void addVehicle(String make, String model, Plate plate, Customer owner) {
        Vehicle vehicle = new Vehicle(make, model, plate, owner);
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(this.vehicles);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void addSparePart(String name, int price) {
        SparePart sparePart = new SparePart(name, price);
        spareParts.add(sparePart);
    }


    public List<SparePart> getSpareParts() {
        return spareParts;
    }

    public void addRepair(Date date, String description, int effort, Vehicle vehicle, BreakdownTypes breakDownTypes, Mechanic mechanic) throws Exception {

        Repair repair = new Repair(date, description, effort, vehicle, breakDownTypes);
        repair.setMechanics(mechanic);
        this.repairs.add(repair);
    }

    public List<Repair> getRepairs() {
        return new ArrayList<>(this.repairs);
    }



}
