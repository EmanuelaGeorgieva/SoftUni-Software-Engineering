package whileLoopExercise;

import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;

        int reachSteps = 0;
        String command = scanner.nextLine();
        while (!command.equals("Going home")){
            int currentSteps = Integer.parseInt(command);
            reachSteps = reachSteps + currentSteps;

            if (reachSteps >= targetSteps){
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")){
            int goingHomeSteps = Integer.parseInt(scanner.nextLine());
            reachSteps = reachSteps + goingHomeSteps;
        }
        int diff = Math.abs(reachSteps - targetSteps);
        if (reachSteps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!" , diff);
        }else{
            System.out.printf("%d more steps to reach goal." , diff);
        }
    }
}
