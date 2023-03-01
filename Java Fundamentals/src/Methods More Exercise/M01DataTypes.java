package methodsMoreExercise;

import java.util.Scanner;

public class M01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String element = scanner.nextLine();

        switch (command){
            case "int":
                int result = number(element);
                System.out.println(result);
                break;
            case "real":
                double result1 = real(element);
                System.out.printf("%.2f", result1);
                break;
            case "string":
                String result2 = text(element);
                System.out.println(result2);
                break;
        }

    }
    public static int number(String element){
        int num = Integer.parseInt(element);
        return num * 2;
    }

    public static double real(String element){
        double num = Double.parseDouble(element);
        return num * 1.5;
    }

    public static String text(String element){
        return ("$" + element + "$");
    }
}
