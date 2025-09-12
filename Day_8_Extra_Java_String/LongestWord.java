import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().split(" ");
        String l="";
        for(String x:w) if(x.length()>l.length()) l=x;
        System.out.println(l);
    }
}
