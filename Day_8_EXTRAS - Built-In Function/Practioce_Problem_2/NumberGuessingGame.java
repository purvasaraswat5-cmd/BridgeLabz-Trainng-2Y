import java.util.*;
public class NumberGuessingGame {
    static int generateGuess(Random rand,int low,int high){return rand.nextInt(high-low+1)+low;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int low=1,high=100;
        while(true){
            int guess=generateGuess(rand,low,high);
            System.out.println("Is your number "+guess+"? (high/low/correct)");
            String feedback=sc.nextLine();
            if(feedback.equals("correct")){System.out.println("Guessed correctly!");break;}
            else if(feedback.equals("high")) high=guess-1;
            else if(feedback.equals("low")) low=guess+1;
        }
    }
}
