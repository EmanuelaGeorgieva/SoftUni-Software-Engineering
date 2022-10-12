package methodsLab;

import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(textToRepeat(textInput, n));
    }
    public static String textToRepeat(String repeat, int n){
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += repeat;
        }
        return result;
    }
}
