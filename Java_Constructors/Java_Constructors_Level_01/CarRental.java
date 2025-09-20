class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Ravi", "Honda City", 5, 1200);
        CarRental r2 = new CarRental("Meera", "Toyota Innova", 3, 1800);
        r1.display();
        r2.display();
    }
}
