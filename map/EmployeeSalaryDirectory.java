import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String,Double> sal = new HashMap<>();

        sal.put("A",50000.0);
        sal.put("B",60000.0);
        sal.put("C",45000.0);
        sal.put("D",70000.0);
        sal.put("E",55000.0);
        sal.put("F",65000.0);

        sal.put("A", sal.get("A") * 1.10);
        sal.put("E", sal.get("E") * 1.05);

        double sum = 0;
        for (double v : sal.values()) sum += v;
        System.out.println(sum / sal.size());

        double max = Collections.max(sal.values());
        for (String k : sal.keySet())
            if (sal.get(k) == max)
                System.out.println(k);
    }
}
