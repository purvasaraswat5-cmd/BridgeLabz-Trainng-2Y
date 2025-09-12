import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().replaceAll("\\s","").toLowerCase();
        String s2=sc.nextLine().replaceAll("\\s","").toLowerCase();
        char[] a=s1.toCharArray(),b=s2.toCharArray();
        Arrays.sort(a);Arrays.sort(b);
        System.out.println(Arrays.equals(a,b)?"Anagrams":"Not Anagrams");
    }
}
