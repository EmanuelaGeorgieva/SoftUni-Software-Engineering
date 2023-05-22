package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            //ако не съм срещала до сега символа
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            }
            //ако съм срещала до сега символа
            else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }

        //запис: символ -> бр. срещания
        symbolsCount.
                forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
