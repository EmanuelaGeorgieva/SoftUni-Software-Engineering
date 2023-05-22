package methodsLab;

import java.util.Scanner;

public class L01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());

        signOfIntegerNumbers(numberInput);
    }

    private static void signOfIntegerNumbers(int numberInput){
        if (numberInput > 0){
            System.out.printf("The number %d is positive.", numberInput);
        }else if(numberInput < 0){
            System.out.printf("The number %d is negative.", numberInput);
        }else {
            System.out.println("The number 0 is zero.");
        }
    }
}
