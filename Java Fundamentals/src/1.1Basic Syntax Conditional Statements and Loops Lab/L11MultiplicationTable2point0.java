package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class L11MultiplicationTable2point0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10){
            System.out.printf("%n%d X %d = %d",number, times, times * number);
        }
        for (int i = times; i <= 10 ; i++) {
            System.out.printf("%n%d X %d = %d",number, i, i * number);
        }
    }
}
