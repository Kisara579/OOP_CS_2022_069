package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one : 'entree', 'side dish', and 'drink' : ");
        String user = input.nextLine();

        if (user.equals("entree")) {
            System.out.println("Entree         Price\n" +
                    "Tofu Burger    $3.49 \n" +
                    "Cajun Chicken  $4.59\n" +
                    "Buffalo Wings  $3.99 \n" +
                    "Rainbow Fillet $2.99\n");
        } else if (user.equals("side dish")) {
            System.out.println("Side Dish      Price\n" +
                    "Rice Cracker   $0.79 \n" +
                    "No-Salt Fries  $0.69\n" +
                    "Zucchini       $1.09 \n" +
                    "Brown Rice     $0.59");
        } else if (user.equals("drink")) {
            System.out.println("Drink       Price\n" +
                    "Cafe Mocha  $1 .99\n" +
                    "Cafe Latte  $1 .90\n" +
                    "Espresso    $2 .49\n" +
                    "Oolong Tea  $0 .99");
        }


    }
}
