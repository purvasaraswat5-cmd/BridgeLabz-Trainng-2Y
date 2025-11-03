class ServiceOverdueException extends Exception { ServiceOverdueException(String m){super(m);} }
class InvalidMileageException extends Exception { InvalidMileageException(String m){super(m);} }
class Vehicle {
    void checkMaintenance(int days, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (days > 30) throw new ServiceOverdueException("Service overdue!");
        if (mileage < 0) throw new InvalidMileageException("Invalid mileage!");
        System.out.println("Vehicle in good condition");
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try { v.checkMaintenance(40, 12000); }
        catch (ServiceOverdueException | InvalidMileageException e) { System.out.println(e.getMessage()); }
    }
}
