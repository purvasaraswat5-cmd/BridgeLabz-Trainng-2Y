import java.util.*;

abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public List<T> getItems() { return items; }
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) System.out.println(i.getClass().getSimpleName());
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> store = new Storage<>();
        store.add(new Electronics());
        Storage.displayAll(store.getItems());
    }
}
