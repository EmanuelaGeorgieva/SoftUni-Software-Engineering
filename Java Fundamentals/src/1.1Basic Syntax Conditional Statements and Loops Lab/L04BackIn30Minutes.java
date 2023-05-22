package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class L04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMin = (hours * 60) + minutes + 30;

        int h = allMin / 60;
        int m = allMin % 60;

        if (h > 23){
            h = 0;
        }
        System.out.printf("%d:%02d", h, m);
    }
}
