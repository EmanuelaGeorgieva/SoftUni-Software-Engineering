package conditionalStatementsExercise;

import java.util.Scanner;

public class E01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTimeSec = timeFirst + timeSecond + timeThird;

        int minutes = totalTimeSec / 60;
        int seconds = totalTimeSec % 60;

        System.out.printf("%d:%02d" , minutes, seconds);

    }
}
