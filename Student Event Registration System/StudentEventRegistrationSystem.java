package oops;
import java.util.*;

// Generic Participant class
class Participant<T> {
    T rollNo;
    String name, branch;

    Participant(T rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    public String toString() {
        return rollNo + " - " + name + " (" + branch + ")";
    }
}

// Event Registration System
class EventRegistration<T> {
    int capacity;
    ArrayList<Participant<T>> mainList = new ArrayList<>();
    LinkedList<Participant<T>> waitingList = new LinkedList<>();
    HashSet<T> rollNos = new HashSet<>();

    EventRegistration(int capacity) {
        this.capacity = capacity;
    }

    void register(Participant<T> p) {
        if (rollNos.contains(p.rollNo)) {
            System.out.println("Duplicate roll number: " + p.rollNo);
            return;
        }
        rollNos.add(p.rollNo);
        if (mainList.size() < capacity) mainList.add(p);
        else waitingList.add(p);
    }

    void cancel(T rollNo) {
        for (Participant<T> p : mainList) {
            if (p.rollNo.equals(rollNo)) {
                mainList.remove(p);
                rollNos.remove(rollNo);
                if (!waitingList.isEmpty()) {
                    Participant<T> next = waitingList.removeFirst();
                    mainList.add(next);
                    rollNos.add(next.rollNo);
                }
                return;
            }
        }
        System.out.println("Roll number not found: " + rollNo);
    }

    void display() {
        System.out.println("\nMain List:");
        mainList.forEach(System.out::println);
        System.out.println("Waiting List:");
        waitingList.forEach(System.out::println);
    }
}

// Main class
public class StudentEventRegistrationSystem {
    public static void main(String[] args) {
        EventRegistration<Integer> event = new EventRegistration<>(2);

        event.register(new Participant<>(1, "Anil", "CSE"));
        event.register(new Participant<>(2, "Ankit", "ECE"));
        event.register(new Participant<>(3, "Honey", "CSE"));
        event.register(new Participant<>(4, "Ragul", "EEE"));

        event.display();

        System.out.println("\nCancelling roll no 1...");
        event.cancel(1);

        event.display();
    }
}
