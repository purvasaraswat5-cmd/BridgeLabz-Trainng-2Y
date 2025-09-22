import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) { super(number, "Car", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 2000; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance Fixed: 2000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) { super(number, "Bike", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 500; }
    @Override
    public String getInsuranceDetails() { return "Bike Insurance Fixed: 500"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) { super(number, "Truck", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 5000; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance Fixed: 5000"; }
}

public class VehicleRentalApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 1000));
        vehicles.add(new Bike("B456", 300));
        vehicles.add(new Truck("T789", 2000));
        for (Vehicle v : vehicles) {
            double cost = v.calculateRentalCost(5);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println(v.getVehicleNumber() + " Total: " + (cost + insurance));
        }
    }
}
