package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter inner radius ? ");
        int ri = input.nextInt();

        System.out.println("Enter outer radius ? ");
        int ro = input.nextInt();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerCircleArea = innerCircle.computeArea();
        double outerCircleArea = outerCircle.computeArea();

        double shadedArea = outerCircleArea - innerCircleArea;

        System.out.println("Shaded Area "+shadedArea);

    }
}
