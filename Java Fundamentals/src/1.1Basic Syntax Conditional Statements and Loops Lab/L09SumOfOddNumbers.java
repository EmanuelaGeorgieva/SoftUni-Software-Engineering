package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class L09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n * 2 ; i++) {
            if (i % 2 != 0){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
