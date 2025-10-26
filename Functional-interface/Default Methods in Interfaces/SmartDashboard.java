interface Vehicle {
    void displaySpeed(int speed);
    default void displayBattery(int batteryLevel) {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

class Car implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }
    public void displayBattery(int batteryLevel) {
        System.out.println("Electric Car Battery: " + batteryLevel + "%");
    }
}

public class SmartDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();
        car.displaySpeed(80);
        eCar.displaySpeed(100);
        car.displayBattery(0);
        eCar.displayBattery(85);
    }
}
