import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("978-1","Java");
        map.put("978-2","Python");
        map.put("978-3","C++");

        String isbn = "978-2";
        System.out.println(map.getOrDefault(isbn,"Book not found"));

        map.remove("978-3");

        for (String k : map.keySet())
            System.out.println(k+" = "+map.get(k));

        String title = "Java";
        for (String k : map.keySet())
            if (map.get(k).equals(title))
                System.out.println(k);
    }
}
