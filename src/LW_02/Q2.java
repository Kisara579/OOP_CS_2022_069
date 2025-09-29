package LW_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;


        do {
            System.out.println("Enter the Number : ");
            number = input.nextInt();


            if (number < 0) {
                break;
            }
            int digit = countDigits(number);
            System.out.println("Number has " + digit + " digits.");
        } while (true);

    }

    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            count = 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
        }
    }






