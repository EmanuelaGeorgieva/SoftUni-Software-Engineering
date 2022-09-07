package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class L03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        if (number > 2.99){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
