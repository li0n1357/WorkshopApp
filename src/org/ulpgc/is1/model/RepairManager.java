package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    private List<Mechanic> mechanics;
    private List<Vehicle> vechicles;
    private List<Repair> repairs;
    public RepairManager(){
        mechanics = new ArrayList<>();
        vechicles = new ArrayList<>();
        repairs = new ArrayList<>();
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
        vechicles.add(vehicle);
    }

    //Obtenemos un vehículo por índice y devolvemos null si el índice es inválido
    public Vehicle getVehicle(int index){
        if (index >= 0 && index < vechicles.size()) {
            return vechicles.get(index);
        }
        return null;
    }

    public boolean repair(){
        return true;
    }

}
