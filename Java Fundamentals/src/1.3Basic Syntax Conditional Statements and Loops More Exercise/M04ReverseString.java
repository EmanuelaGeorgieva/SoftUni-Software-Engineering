package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class M04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println(output);
    }
}
