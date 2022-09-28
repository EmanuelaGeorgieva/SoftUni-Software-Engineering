package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class L07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e ->Integer.parseInt(e)).toArray();

        while (inArr.length > 1){
            int[] condArr = new int[inArr.length -1];
            for (int j = 0; j < inArr.length-1; j++) {
                condArr[j] = inArr[j] + inArr[j +1];
            }

            inArr = condArr;

        }
        System.out.println(inArr[0]);
    }
}
