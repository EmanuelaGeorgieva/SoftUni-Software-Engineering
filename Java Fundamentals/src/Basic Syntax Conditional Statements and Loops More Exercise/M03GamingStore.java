package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class M03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double price = 0;
        double spend = 0;
        while (!game.equals("Game Time")) {
            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;
            }

            if(price > currentBalance) {
                System.out.println("Too Expensive");
                game = scanner.nextLine();
                continue;
            }

            currentBalance -= price;
            spend += price;
            System.out.printf("Bought %s" , game);
            System.out.println();

            if(currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            game = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, currentBalance);
    }
}
