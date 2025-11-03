import java.util.*;
class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++) list.add(i*5);
        int sum=0;
        for(Integer n : list) sum += n;
        System.out.println("Sum of numbers = " + sum);
    }
}
