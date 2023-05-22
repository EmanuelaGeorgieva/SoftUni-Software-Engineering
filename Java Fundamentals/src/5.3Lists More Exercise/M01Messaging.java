package listsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] numbers = scanner.nextLine().split(" ");
        String text = scanner.nextLine();
        List<Integer> num = new ArrayList<>();
        for (String numStr : numbers) {
            num.add(Integer.parseInt(numStr));
        }
        StringBuilder sb = new StringBuilder(text);
        StringBuilder result = new StringBuilder();
        for (int number : num) {
            int index = sumDigits(number) % sb.length();
            char symbol = sb.charAt(index);
            result.append(symbol);
            sb.deleteCharAt(index);
        }
        System.out.println(result.toString());
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
