package methodsLab;

import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String math = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

        switch (math){
            case "/":
                double result = firstNum / secondNum;
                System.out.printf("%.0f",result);
                break;
            case "*":
                double result1 = firstNum * secondNum;
                System.out.printf("%.0f",result1);
                break;
            case "+":
                double result2 = firstNum + secondNum;
                System.out.printf("%.0f",result2);
                break;
            case "-":
                double result3 = firstNum - secondNum;
                System.out.printf("%.0f",result3);
                break;
        }
    }
}
