package LW_04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 101);
        int number;

        do{
            System.out.println("Guess the number between 1 and 100");
            number = input.nextInt();

            if(number<randomNum){
                System.out.println("Try Again! , Guess Higher Number");
            } else if (number>randomNum) {
                System.out.println("Try Again! , Guess Lower Number");
            }
        }while(randomNum!=number);


        System.out.println("You are correct.");
    }
}
