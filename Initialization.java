package Calc;

import java.util.Scanner;

/**
 * Created by 1nsomnia on 14-Aug-16.
 */
public class Initialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the first number: ");
        try {
            double d1 = Double.parseDouble(sc.next());
            System.out.println("What kind of operation would you like to do?\n" +
                    "Choose between \"+, -, *, /\" : ");
            String zn = sc.next();

            System.out.println("Please type the second number: ");
            double d2 = Double.parseDouble(sc.next());
            sc.close();

            System.out.println("Result is: " + Calculation.calc(d1, zn, d2));
        } catch (NumberFormatException e) {
            System.out.println("You entered not a number");
        }
    }
}