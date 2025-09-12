import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w1=sc.nextLine(),w2=sc.nextLine();
        String res=s.replaceAll("\\b"+w1+"\\b",w2);
        System.out.println(res);
    }
}
