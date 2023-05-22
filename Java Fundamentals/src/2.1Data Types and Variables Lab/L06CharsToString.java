package dataTypesAndVariablesLab;

import java.util.Scanner;

public class L06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCharacter = scanner.nextLine();
        String secondCharacter = scanner.nextLine();
        String thirdCharacter = scanner.nextLine();

        System.out.printf("%s%s%s", firstCharacter,secondCharacter,thirdCharacter);
    }
}
