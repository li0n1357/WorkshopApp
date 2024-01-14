package org.ulpgc.is1.control;


import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void init(RepairManager repairManager) throws Exception {

        //Creación de mecánicos
        repairManager.addMechanic("Francisco Javier", "Monleón", "Peña");
        repairManager.addMechanic("Daniel", "Parrilla", "Acosta");

        //Creación de vehículos
        repairManager.addVehicle("Jeep", "Renegade", new Plate("4450LMD"), new Customer("Javier", new Phone("664142307")));
        repairManager.addVehicle("Porche", "911", new Plate("6977MMM"), new Customer("Manuel", new Phone("674332819")));

        //Creación de piezas
        repairManager.repairs("Neumático Radial", 4);
        repairManager.repairs("Motor Diesel", 15);
    }

    public static void main(String[] args) throws Exception {

        RepairManager repairManager = new RepairManager();
        init(repairManager);

        System.out.println("----------------------");
        System.out.println(repairManager.getMechanic().get(0).toString());
        System.out.println("----------------------");
        System.out.println(repairManager.getVehicle().get(1).toString());
        System.out.println("----------------------");

        repairManager.repairs(new Date(), "Reparación de Jeep Renegade por Daniel Parrilla Acosta", 100, repairManager.getVehicle().get(1), BreakdownTypes.MECHANICAL, repairManager.getMechanic().get(0));
        Vehicle.getRepairList().get(0).addPayment(1, repairManager.getSparePart().get(0));
        Vehicle.getRepairList().get(0).addPayment(2, repairManager.getSparePart().get(1));

        Vehicle.getRepairList().get(0).addPayment(new Payment(new Date(), repairManager.getRepairs().get(0).price()));

        repairManager.removeVehicle(repairManager.getVehicle().get(0));
        System.out.println("Nºvehiculos: " + repairManager.getVehicle().size());
        System.out.println("----------------------");

        System.out.println(Vehicle.getRepairList().get(0).toString());
        System.out.println("----------------------");

    }
}
