package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPages = Integer.parseInt(scanner.nextLine());
        int readPagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = countPages / readPagesPerHour;
        int hoursPerDay = totalHours / days;

        System.out.println(hoursPerDay);
    }
}
