package Week5Lists.Exercise;

import java.awt.geom.IllegalPathStateException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        // индекса е вагона, а стойността е броя на пасажерите

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int addWagon = Integer.parseInt(command.split(" ")[1]);
                wagons.add(addWagon);
            } else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengers <= maxCapacity){
                        wagons.set(i, currentWagon + passengers);
                        break;
                    }


                }


            }
            command = scanner.nextLine();

        }

        for (int num : wagons) {
            System.out.print(num + " ");
        }


    }
}
