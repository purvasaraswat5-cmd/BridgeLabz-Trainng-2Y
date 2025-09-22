class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Rahul", 30, "Fever");
        Patient p2 = new Patient(2, "Sita", 25, "Cold");
        p1.displayPatient();
        p2.displayPatient();
        Patient.getTotalPatients();
    }
}
