package listsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resulList = new ArrayList<>();

        int minSize = Math.min(firsList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int firstItem = firsList.get(i);
            int secondItem = secondList.get(i);
            resulList.add(firstItem);
            resulList.add(secondItem);
        }
        if (firsList.size() > secondList.size()){
            resulList.addAll(firsList.subList(minSize, firsList.size()));
        }else {
            resulList.addAll(secondList.subList(minSize, secondList.size()));
        }
        System.out.println(resulList.toString().replaceAll("[\\[\\],]", ""));
    }
}
