class Prototype implements Cloneable {
    int id;
    String name;
    Prototype(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningExample {
    public static void main(String[] args) {
        try {
            Prototype p1 = new Prototype(1, "Original");
            Prototype p2 = (Prototype) p1.clone();
            System.out.println("Cloned object: ID=" + p2.id + ", Name=" + p2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
