import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId; this.name = name; this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + " Name: " + name + " Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int days;
    private List<String> records = new ArrayList<>();
    public InPatient(int id, String name, int age, double rate, int days) {
        super(id, name, age); this.dailyRate = rate; this.days = days;
    }
    @Override
    public double calculateBill() { return dailyRate * days; }
    @Override
    public void addRecord(String record) { records.add(record); }
    @Override
    public List<String> viewRecords() { return records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();
    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age); this.consultationFee = fee;
    }
    @Override
    public double calculateBill() { return consultationFee; }
    @Override
    public void addRecord(String record) { records.add(record); }
    @Override
    public List<String> viewRecords() { return records; }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(1, "John", 40, 2000, 5));
        patients.add(new OutPatient(2, "Mary", 30, 500));
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
