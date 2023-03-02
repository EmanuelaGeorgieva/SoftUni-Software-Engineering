package methodsMoreExercise;

import java.util.Scanner;

public class M02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());

        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        printsClosestToTheCenterPoints(x1, y1, x2, y2);

    }

    public static void printsClosestToTheCenterPoints(double x1, double y1, double x2, double y2){
        double result = x1 + y1;
        double result1 = x2 + y2;

        if (result < result1){
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}
