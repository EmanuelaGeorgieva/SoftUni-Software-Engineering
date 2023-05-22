package dataTypesAndVariablesLab;

import java.util.Scanner;

public class L07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstCharacter = scanner.nextLine();
        String secondCharacter = scanner.nextLine();
        String thirdCharacter = scanner.nextLine();

        System.out.printf("%s %s %s", thirdCharacter,secondCharacter,firstCharacter);
    }
}
