package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Length in centimetres ? ");

        double centi = input.nextDouble();

        double inch = centi/2.54;
        int feet =(int) inch/12;
        inch = inch%12;

        System.out.println(feet+" feet and "+inch+" inches");

    }
}
