package forLoopExercise;

import java.util.Scanner;

public class E04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double money = 0;
        double allMoney = 0;
        int brotherCount = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                countToys++;
            } else {
                brotherCount++;
                money = money + 10;
                allMoney = allMoney + money;
            }
        }

        double sumToys = countToys * priceToys;
        double totalSum = sumToys + allMoney - brotherCount;

        double diff = Math.abs(totalSum - priceLaundry);
        if (totalSum >= priceLaundry) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
