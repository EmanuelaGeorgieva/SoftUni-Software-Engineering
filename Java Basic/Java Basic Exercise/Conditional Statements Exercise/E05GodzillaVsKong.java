package conditionalStatementsExercise;

import java.util.Scanner;

public class E05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneSuits = Double.parseDouble(scanner.nextLine());

        double decorSum = budget * 0.10;
        double sumSuits = people * priceOneSuits;

        if (people > 150) {
            sumSuits = sumSuits * 0.90;
        }

        double totalSum = decorSum + sumSuits;

        double diff = Math.abs(totalSum - budget);
        if (totalSum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
