package whileLoopExercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        double finalSum = availableMoney;

        int spendingCountDays = 0;
        int totalDais = 0;
        boolean isFailed = false;

        while (finalSum < needMoney){
            if (spendingCountDays >= 5){
                isFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            totalDais++;

            if (action.equals("spend")){
                spendingCountDays++;
                finalSum = finalSum - amount;
                if (finalSum < 0){
                    finalSum = 0;
                }
            }else if(action.equals("save")){
                spendingCountDays = 0;
                finalSum = finalSum + amount;
            }
        }
        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(totalDais);
        }else{
            System.out.printf("You saved the money for %d days." , totalDais);
        }
    }
}
