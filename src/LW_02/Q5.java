package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(sentence,",.!?;: ");

        while(stringTokenizer.hasMoreTokens()){
            String convert_lower = stringTokenizer.nextToken().toLowerCase();
            stringBuilder.append(convert_lower);
        }
        String original = stringBuilder.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        if(original.equals(reversed)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
