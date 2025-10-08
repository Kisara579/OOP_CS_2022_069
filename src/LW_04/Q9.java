package LW_04;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        int rows = input.nextInt();

        for(int i=1; i<=rows; i++){
            for(int k=0; k<rows-i; k++){
                System.out.print(" ");
            }
            for(int j =0;j<(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
