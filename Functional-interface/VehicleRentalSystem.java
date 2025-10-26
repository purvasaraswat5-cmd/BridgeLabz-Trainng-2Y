interface Rentable {
    void rent();
    void returnVehicle();
}

class Car implements Rentable {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

class Bus implements Rentable {
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();
        car.rent();
        bike.rent();
        bus.rent();
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
