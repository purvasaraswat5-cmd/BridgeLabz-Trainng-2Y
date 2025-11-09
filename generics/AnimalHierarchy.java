import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class AnimalHierarchy {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}
