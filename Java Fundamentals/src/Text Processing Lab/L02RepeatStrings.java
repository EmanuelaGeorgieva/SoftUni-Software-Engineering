package textProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        //hi abc add
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String currentWord = strArr[i];
            int len = currentWord.length();

            String repeatWord = repeatStr(currentWord, len);
            repeatList.add(repeatWord);
        }

        System.out.println(String.join("", repeatList));
    }

    public static String repeatStr(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }

        return result;
    }
}
