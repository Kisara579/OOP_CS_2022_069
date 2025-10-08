package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 Numbers?");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

//        if (A < B) {
//            if (A < C) {
//                System.out.println("Minimum Number is : " + A);
//            } else {
//                System.out.println("Minimum Number is : " + C);
//            }
//        } else {
//            if (B < C) {
//                System.out.println("Minimum Number is : " +B);
//            }
//            else{
//                System.out.println("Minimum Number is : " +C);
//            }
//        }
        int small = A;
        if(small>B){
            small = B;
        }
        if(small>C){
            small = C;
        }
        System.out.println("Smallest Number is :"+small);
    }
}
