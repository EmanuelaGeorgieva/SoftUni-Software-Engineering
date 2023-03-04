package methodsMoreExercise;

import java.util.Scanner;

public class M04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = firstNum * secondNum * thirdNum;

        if (sum < 0){
            System.out.println("negative");
        }else if(sum == 0){
            System.out.println("zero");
        }else {
            System.out.println("positive");
        }
    }
}
