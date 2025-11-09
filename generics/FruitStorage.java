import java.util.*;

class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    public void add(T fruit) { fruits.add(fruit); }
    public void display() { for (T f : fruits) System.out.println(f.getClass().getSimpleName()); }
}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.add(new Mango());
        fb.display();
    }
}
