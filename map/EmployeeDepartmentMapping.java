import java.util.*;
public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer,String> emp = new HashMap<>();

        emp.put(101,"HR");
        emp.put(102,"IT");
        emp.put(103,"Finance");
        emp.put(104,"IT");
        emp.put(105,"HR");

        emp.put(103, "IT");

        String dept = "IT";
        for (Integer id : emp.keySet())
            if (emp.get(id).equals(dept))
                System.out.println(id);

        Map<String,Integer> count = new HashMap<>();
        for (String d : emp.values())
            count.put(d, count.getOrDefault(d,0)+1);

        System.out.println(count);
    }
}
