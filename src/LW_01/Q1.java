package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter odd-length word ? ");
        String word = input.next();
        int length = word.length();

        System.out.println("Middle Character : "+word.charAt(length/2));
    }
}
