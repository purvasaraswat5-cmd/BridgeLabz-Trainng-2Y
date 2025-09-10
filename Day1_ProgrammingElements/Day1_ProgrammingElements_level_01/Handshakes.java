package javaprogrammingElement_level_01;

import java.util.Scanner;

public class Handshakes {
     public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the number of students: ");
        int Students = input.nextInt();

        int Handshakes = (Students * (Students - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + Handshakes);

        }
    }
    
}
