package methodsLab;

import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int pieceInput = Integer.parseInt(scanner.nextLine());

        double total = products(productInput, pieceInput);
        System.out.printf("%.2f", total);
    }
    private static double products(String product, int piece) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;

        }
        return piece * price;
    }
}
