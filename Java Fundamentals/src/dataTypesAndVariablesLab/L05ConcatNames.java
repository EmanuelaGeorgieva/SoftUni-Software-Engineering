package dataTypesAndVariablesLab;

import java.util.Scanner;

public class L05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String symbol = scanner.nextLine();

        String result = firstName + symbol + secondName;
        System.out.println(result);
    }
}
