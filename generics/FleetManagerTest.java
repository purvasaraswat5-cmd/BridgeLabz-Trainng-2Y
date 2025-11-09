import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T vehicle) { fleet.add(vehicle); }
    public void showFleet() { for (T v : fleet) System.out.println(v.getClass().getSimpleName()); }
}

public class FleetManagerTest {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());
        trucks.showFleet();
    }
}
