package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private String name;
    private String surname;
    private List<Repair> repairList;
    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.repairList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Repair> getRepairList() {
        return repairList;
    }

    public void addRepair(Repair repair) {
        if (!repairList.contains(repair)) repairList.add(repair);
    }
    @Override
    public String toString(){
        return this.getName() + " " + this.getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Mechanic)) return false;
        Mechanic other = (Mechanic)o;
        return ((other.name.equals(name)) && (other.surname.equals(surname)));
                }

}