package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeOfTheAquarium = lengthCm * widthCm * heightCm;
        double volumeInLiters = volumeOfTheAquarium * 0.001;
//        double sumWithDiscount = allSuppliesSum - (allSuppliesSum * (percent /100.0));
        double requiredLiters = volumeInLiters - (volumeInLiters * (percent / 100.0));
        System.out.println(requiredLiters);
    }
}
