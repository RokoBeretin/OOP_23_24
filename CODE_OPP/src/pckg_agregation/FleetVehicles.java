package pckg_agregation;

import java.util.ArrayList;

public class FleetVehicles {
    private String company;
    private int companyID;
    private static int cntID = 300;
    private final ArrayList<Vehicle> vehicles;

    public FleetVehicles(String company) {
        this.company = company;
        this.companyID = cntID++;
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            System.out.println("This vehicle is already in the fleet!");
        } else {
            vehicles.add(vehicle);
            System.out.println("New vehicle added to the fleet!");
        }
    }

    public void removeVehicle(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Vehicle: " + vehicle + " removed from the fleet!");
        } else {
            System.out.println("This vehicle is not in the fleet!");
        }

    }

    public Vehicle getVehicleFromFleet(int idxPos){
        Vehicle vehicle = null;
        if(idxPos<0 || idxPos>vehicles.size()){
            System.out.println("Index out of bounds - size is: " + vehicles.size());
        } else {
            vehicle = vehicles.get(idxPos);
        }
        return vehicle;
    }
    public Vehicle getVehicle(Vehicle vehicle){
        Vehicle vehicle1 = null;
        if(vehicles.contains(vehicle)){
            System.out.println("Vehicle is not in the fleet");
        } else {
            vehicle1 = vehicles.get(vehicles.indexOf(vehicle));
        }
        return vehicle1;
    }

    public void listAllVehicles(){
        for(Vehicle veh : vehicles){
            System.out.println(veh);
        }
    }
}




