package LW_03.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Temperature temperature = new Temperature();

        System.out.println("Enter 'c' for Celsius and 'f' for Fahrenheit in Temperature ?");
        String temp = input.next();

        if(temp.equals("c") || temp.equals("C")){
            System.out.println("Enter the temperature in  Celsius: ");
            temperature.setCelsius(input.nextDouble());
            System.out.println("Temperature is "+temperature.toFahrenheit()+"F");
        }
        else if(temp.equals("f") || temp.equals("F")){
            System.out.println("Enter the temperature in  Fahrenheit: ");
            temperature.setFahrenheit(input.nextDouble());
            System.out.println("Temperature is "+temperature.toCelsius()+"C");
        }
        else {
            System.out.println("Wrong Input");
        }

    }
}
