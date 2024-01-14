package org.ulpgc.is1.control;


import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void init(RepairManager repairManager) throws Exception {
        RepairManager.addVehicle("Jeep", "Renegade", new Plate("4450LMD"), new Customer("Javier", new Phone("664142307")));
        RepairManager.addVehicle("Porche", "911", new Plate("6977MMM"), new Customer("Manuel", new Phone("674332819")));

        RepairManager.addMechanic("Francisco Javier", "Monleón", "Peña");
        RepairManager.addMechanic("Daniel", "Parrilla", "Acosta");

        RepairManager.repairs("Neumático Radial", 4);
        RepairManager.repairs("Motor Diesel", 15);
        RepairManager.repairs("Parabrisas", 18);
        RepairManager.repairs("Puerta Maletero", 1);
    }

    public static void main(String[] args) throws Exception {

        RepairManager.repairs(new Date(), "Reparación de Jeep Renegade por Daniel Parrilla Acosta", 100, repairManager.getVehicle().get(1), BreakdownTypes.MECHANICAL, repairManager.getMechanic().get(0));
        Vehicle.getRepairList().get(0).addPayment(1, RepairManager.getSparePart().get(0));
        Vehicle.getRepairList().get(0).addPayment(2, RepairManager.getSparePart().get(1));

        RepairManager repairManager = new RepairManager();
        init(repairManager);
        System.out.println(repairManager.getMechanic().get(0).toString());
        System.out.println(RepairManager.getVehicle().get(1).toString());

        Vehicle.getRepairList().get(0).addPayment(new Payment(new Date(), RepairManager.getRepairs().get(0).price()));

        RepairManager.removeVehicle(RepairManager.getVehicle().get(0));
        System.out.println("Nºvehiculos: " + RepairManager.getVehicle().size());
        System.out.println("----------------------");
        System.out.println(Vehicle.getRepairList().get(0).toString());
        System.out.println("----------------------");

    }
}
