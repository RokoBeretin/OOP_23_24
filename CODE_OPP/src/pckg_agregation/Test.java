package pckg_agregation;

public class Test {
    public static void main(String[] args) {
        FleetVehicles vehicles = new FleetVehicles("Big company");
        Vehicle veh1 = new Vehicle("model1");
        Vehicle veh2 = new Vehicle("model2");
        Vehicle veh3 = new Vehicle("model3");

        vehicles.addNewVehicle(veh1);
        vehicles.addNewVehicle(veh2);
        vehicles.addNewVehicle(veh3);
        vehicles.removeVehicle(veh3);
        vehicles.listAllVehicles();
    }
}
