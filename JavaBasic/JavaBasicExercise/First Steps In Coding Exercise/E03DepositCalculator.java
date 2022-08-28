package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double increase = deposit * (percent / 100);
        double montlyIncrease = increase / 12;
        double result = deposit + months * montlyIncrease;
        System.out.println(result);
    }
}
