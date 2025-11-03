import java.util.*;
class EmployeeAges {
    public static void main(String[] args){
        int[] ages={25,30,45,20,40};
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:ages) list.add(a);
        System.out.println("Youngest: "+Collections.min(list));
        System.out.println("Oldest: "+Collections.max(list));
    }
}
