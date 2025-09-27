package LW_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while(true){
            int count = 0;

            System.out.println("Enter the Number : ");
            number =  input.nextInt();

            if(number<0){
                break;
            }

            while(number!=0) {
                number = number / 10;
                count++;
            }
            System.out.println("Number has "+count+" digits.");
        }
    }
}
