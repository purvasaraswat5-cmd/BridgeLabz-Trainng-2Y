package demo.staticimport;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double num1 = 25;
        double num2 = -9;

        double squareRoot = sqrt(num1);
        double power = pow(num1, 3);
        double maximum = max(num1, num2);
        double minimum = min(num1, num2);
        double absolute = abs(num2);

        System.out.println("Square root of " + num1 + " = " + squareRoot);
        System.out.println(num1 + " raised to power 3 = " + power);
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + maximum);
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + minimum);
        System.out.println("Absolute value of " + num2 + " = " + absolute);
    }
}
