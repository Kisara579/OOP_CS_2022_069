package LW_02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr  = new int[5];

        for(int i =0; i<5; i++){
            System.out.println("Enter "+(i+1)+" Number : ");
            arr[i] = input.nextInt();
        }

        int max_num1 = arr[0];
        int max_num2 = arr[0];

        for(int i =0; i<5; i++){
            if(arr[i]> max_num1){
                max_num2 = max_num1;
                max_num1 = arr[i];
            } else if (arr[i]>max_num2) {
                max_num2 = arr[i];
            }
        }
        System.out.println("Second-largest element : "+max_num2);
    }
}
