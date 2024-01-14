package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repair {

    private List<Payment> payments;
    public Repair(){
        payments = new ArrayList<>();
    }

    private static int NEXT_ID = 0;
    private int id;
    private Date date;
    private String description;
    private int effort;

    public Repair(Date date, String description, int effort) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.payments = new ArrayList<>();
    }

    public int getId(){
        return id;
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

    public boolean price(int effort){
        return true;
    }

    public void addPayment(Payment payment) {
        
    }

    public void addSparePart(SparePart part2) {
    }

    public String getSpareParts() {
        return description;
    }

    public String getPayments() {
        return description;
    }

}
