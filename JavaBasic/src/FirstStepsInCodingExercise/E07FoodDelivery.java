package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVegetarianMenu = vegetarianMenu * 8.15;

        double allSupplies = priceChickenMenu + priceFishMenu + priceVegetarianMenu;

        double priceDessert = allSupplies - ( allSupplies * 0.80);

        double delivery = 2.50;
        double result = allSupplies + priceDessert + delivery;
        System.out.println(result);
    }
}
