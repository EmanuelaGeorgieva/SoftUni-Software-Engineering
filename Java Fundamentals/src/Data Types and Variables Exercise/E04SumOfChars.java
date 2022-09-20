package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class E04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой символи
        int sum = 0; //сума от аски кодове
        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum += asciiCode;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
