class Vehicle {
    static double registrationFee = 1000.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arun", "Car", "UP32AB1234");
        v1.displayVehicle();
        Vehicle.updateRegistrationFee(1200.0);
        v1.displayVehicle();
    }
}
