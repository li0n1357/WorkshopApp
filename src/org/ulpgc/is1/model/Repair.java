package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repair {

    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private List<Vehicle> vehicle;
    private List<Mechanic> mechanics;
    private Payment payment;
    private List<BreakdownTypes> breakDownTypes;
    private List<Item> items;



    public Repair(Date date, String description, int effort, Vehicle vehicle, BreakdownTypes breakDownTypes) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.items = new ArrayList<>();
        this.mechanics = new ArrayList<>();
        this.vehicle = new ArrayList<>();
    }

    public int price() {
        int price = 0;
        for (Item item:this.items) {
            price += item.getQuantity() * item.getSpareParts().getPrice() + this.effort;
        }
        return price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getId() {
        return id;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {

        this.vehicle.add(vehicle);

    }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Mechanic mechanics) {
        this.mechanics.add(mechanics);
    }

    public void addPayment(Payment payment) {
        this.payment = payment;
    }

    public void addItems(int cantidad, SparePart sparePart) {
        this.items.add(new Item(cantidad, sparePart, this));
    }

    @Override
    public String toString() {
        return String.format("Id: %d \nDate: %s \nDescription: %s \nEffort: %d \nBreakDownTypes: %s", this.id, this.date, this.description, this.effort, this.breakDownTypes) +  "\n" + items.toString() + "\n" + "Precio Total: " + payment.getAmount() + "€";
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
