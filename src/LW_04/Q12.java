package LW_04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String sentence = input.nextLine();

        System.out.println("Enter the word to replace : ");
        String oldword = input.next();
        System.out.println("Enter the replacement word : ");
        String newword = input.next();

        sentence =sentence.replaceAll("(?i)\\b" + oldword + "\\b", newword);

        System.out.println("Updated Sentence "+sentence);

    }
}
