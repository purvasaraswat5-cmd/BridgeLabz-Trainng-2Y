import java.util.*;
public class Palindrome {
    static boolean isPalindrome(String s){
        String r=new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome(s)?"Palindrome":"Not Palindrome");
    }
}
