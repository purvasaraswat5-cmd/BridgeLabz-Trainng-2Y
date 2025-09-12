import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] f=new int[256];
        for(char ch:s.toCharArray()) f[ch]++;
        int max=0;char mc=' ';
        for(char ch:s.toCharArray()) if(f[ch]>max){max=f[ch];mc=ch;}
        System.out.println("Most Frequent Character: "+mc);
    }
}
