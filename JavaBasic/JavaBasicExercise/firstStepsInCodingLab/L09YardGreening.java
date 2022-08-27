package firstStepsInCodingLab;

import java.util.Scanner;

public class L09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardSize = Double.parseDouble(scanner.nextLine());
        double yardPrize = yardSize*7.61;
        double discount = yardPrize * 0.18;
        double finalPrize = yardPrize - discount ;
        System.out.println("The final prize is: " + finalPrize +" lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
