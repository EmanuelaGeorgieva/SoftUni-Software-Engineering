package listsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Contains":
                    int elementToContains = Integer.parseInt(actions.get(1));

                    if (numList.contains(elementToContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondAction = actions.get(1);
                    if (secondAction.equals("even")) {
                        List<Integer> evenElements = getEvenNumbers(numList);
                        System.out.println(evenElements.toString().replace("[", "").replace("]", "").replace(",", ""));
                    } else {
                        List<Integer> oddElements = getOddNumbers(numList);
                        System.out.println(oddElements.toString().replace("[", "").replace("]", "").replace(",", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum += numList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = actions.get(1);
                    int number = Integer.parseInt(actions.get(2));
                    List<Integer> conditionalNumbersList = getConditionNumbers(numList, condition, number);
                    System.out.println(conditionalNumbersList.toString().replace("[", "").replace("]", "").replace(",", ""));
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println();
    }

    public static List<Integer> getOddNumbers(List<Integer> initList) {
        List<Integer> listOfOddNumbers = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (currentElement % 2 == 1) {
                listOfOddNumbers.add(currentElement);
            }
        }
        return listOfOddNumbers;
    }

    public static List<Integer> getEvenNumbers(List<Integer> initList) {
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (currentElement % 2 == 0) {
                listOfEvenNumbers.add(currentElement);
            }
        }
        return listOfEvenNumbers;
    }
    public static List<Integer> getConditionNumbers(List<Integer> initList, String condition, int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (condition.equals("<")) {
                if (currentElement < number) {
                    result.add(currentElement);
                }
            } else if (condition.equals("<=")) {
                if (currentElement <= number) {
                    result.add(currentElement);
                }
            } else if (condition.equals(">")) {
                if (currentElement > number) {
                    result.add(currentElement);
                }
            } else if (condition.equals(">=")) {
                if (currentElement >= number) {
                    result.add(currentElement);
                }
            }
        }
        return result;
    }
}
