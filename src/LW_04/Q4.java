package LW_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year ? ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            }
            else{
                System.out.println(year + " is  not a Leap Year");
            }
        }
        else{
            System.out.println(year + " is  not a Leap Year");
        }
    }
}
