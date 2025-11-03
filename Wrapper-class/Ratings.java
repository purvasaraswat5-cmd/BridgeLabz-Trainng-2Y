import java.util.*;
import java.util.stream.*;
class Ratings {
    public static void main(String[] args){
        int[] prim={4,5,3};
        ArrayList<Integer> obj=new ArrayList<>(Arrays.asList(5,null,4));
        ArrayList<Integer> all=new ArrayList<>();
        for(int p:prim) all.add(p);
        all.addAll(obj);
        double avg=all.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average Rating: "+avg);
    }
}
