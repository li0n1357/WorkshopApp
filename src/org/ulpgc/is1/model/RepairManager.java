package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RepairManager {

    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;
    private List<Repair> repairs;
    private List<SparePart> SparePart;

    public RepairManager(){
        mechanics = new ArrayList<>();
        vehicles = new ArrayList<>();
        repairs = new ArrayList<>();
        SparePart = new ArrayList<>();
    }

    //Agregamos un mecánico a la lista de mecánicos
    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }

    //Obtenemos un mecánico por índice y devolvemos null si el índice es inválido
    public Mechanic getMechanic(int index) {
        if (index >= 0 && index < mechanics.size()) {
            return mechanics.get(index);
        }
        return null;
    }

    //Ahora agregamos un vehículo a la lista de vehículos
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    //Obtenemos un vehículo por índice y devolvemos null si el índice es inválido
    public Vehicle getVehicle(int index){
        if (index >= 0 && index < vehicles.size()) {
            return vehicles.get(index);
        }
        return null;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public List<Repair> getRepairs() {
        return new ArrayList<>(this.repairs);
    }
    public List<SparePart> getSparePart() {return SparePart;}
}
