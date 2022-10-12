package methodsLab;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = resultOfTheNum(n);
        System.out.println(Math.abs(result));
    }

    public static int oddNumbers(int n) {
        int sumOdd = 0;
        while (Math.abs(n) > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                sumOdd = sumOdd + lastDigit;
            }
            n /= 10;
        }
        return sumOdd;
    }

    public static int evenNumbers(int n){
        int sumEven = 0;
        while (Math.abs(n) > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0){
                sumEven = sumEven + lastDigit;
            }
            n /= 10;
        }
        return sumEven;
    }
    public static int resultOfTheNum(int n){
        int evenNum = evenNumbers(n);
        int oddNum = oddNumbers(n);
        return evenNum * oddNum;
    }
}
