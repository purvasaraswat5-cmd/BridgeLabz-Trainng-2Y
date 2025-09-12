import java.util.*;
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), sub=sc.nextLine();
        int c=0,i=0;
        while((i=s.indexOf(sub,i))!=-1){c++;i+=sub.length();}
        System.out.println(c);
    }
}
