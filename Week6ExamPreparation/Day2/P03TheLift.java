package Week6ExamPreparation.Day2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that finds a place for the tourist on a lift.

        // Every wagon should have a maximum of 4 people on it.

        // If a wagon is full, you should direct the people to the next one with space available.


        // Input First Line - > how many people are waiting to get on the lift
        int people = Integer.parseInt(scanner.nextLine());

        List<Integer> wagonsState = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());




        for (int i = 0; i <= wagonsState.size() -1 ; i++) {
            int currentWagon = wagonsState.get(i);
            while (currentWagon < 4 && people > 0){

                currentWagon += 1;
                people -=1;


                if (currentWagon == 4 || people ==0){
                    wagonsState.set(i, currentWagon);
                    break;
                }

            }
            if (people == 0){
                break;
            }

        }

        if (people <= 0){
            System.out.println("The lift has empty spots!");
            for (int item : wagonsState) {
                System.out.print(item + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
            for (int item : wagonsState) {
                System.out.print(item + " ");
            }
        }

    }
}
