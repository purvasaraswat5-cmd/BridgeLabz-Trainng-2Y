import java.io.*;

interface BackupSerializable {}

class UserData implements BackupSerializable, Serializable {
    String name;
    int age;
    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupProcessor {
    public static void main(String[] args) {
        UserData user = new UserData("Ravi", 25);
        if (user instanceof BackupSerializable) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
                oos.writeObject(user);
                System.out.println("Backup created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
