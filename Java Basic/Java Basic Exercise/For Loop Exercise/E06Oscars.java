package forLoopExercise;

import java.util.Scanner;

public class E06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int peopleEvaluate = Integer.parseInt(scanner.nextLine());

        double totalPoints = points;
        for (int i = 1; i <= peopleEvaluate; i++) {
            String nameEvaluate = scanner.nextLine();
            double points1 = Double.parseDouble(scanner.nextLine());

            double currentPointsSum = (nameEvaluate.length() * points1) / 2;

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentPointsSum;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf
                    ("Congratulations, %s got a nominee for leading role with %.1f!",
                            name, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - totalPoints);
        }
    }
}
