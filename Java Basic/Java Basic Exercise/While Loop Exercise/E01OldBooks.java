package whileLoopExercise;

import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        int countBook = 0;
        boolean wasFound = false;
        String command = scanner.nextLine();
        while (!command.equals("No More Books")) {
            String currentBook = command;

            if (currentBook.equals(wantedBook)) {
                wasFound = true;
                break;
            }
            countBook++;
            command = scanner.nextLine();
        }
        if (wasFound) {
            System.out.printf("You checked %d books and found it.", countBook);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", countBook);
        }
    }
}
