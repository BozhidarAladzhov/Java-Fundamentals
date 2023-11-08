package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the input.
        // 1.1 Array of integers, separated by a single space
        // 1.2 Commands. ( swap, multiply, decrease, end)

        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        // 2. Create while cycle to reach "end".
        // 2.1 Create if conditions for the specific command.
        // 2.2 Make the command an array to use the full command properly.


        while (!command.equals("end")){
            String [] commandArray = command.split(" ");


            if (command.contains("swap")){
                int firstIndex = Integer.parseInt(commandArray[1]);
                int secondIndex = Integer.parseInt(commandArray[2]);
                int firstElement = numbersArray[firstIndex];
                int secondElement = numbersArray[secondIndex];

                numbersArray[firstIndex] = secondElement;
                numbersArray[secondIndex] = firstElement;

            }else if (command.contains("multiply")){
                int firstIndex = Integer.parseInt(commandArray[1]);
                int secondIndex = Integer.parseInt(commandArray[2]);
                int firstElement = numbersArray[firstIndex];
                int secondElement = numbersArray[secondIndex];
                int sumElement = firstElement * secondElement;

                numbersArray[firstIndex] = sumElement;

            }else if (command.contains("decrease")){
                for (int element = 0; element < numbersArray.length; element++) {
                    numbersArray[element] = numbersArray[element] - 1;
                }

            }

            command = scanner.nextLine();
        }


        String [] stringArray = new String[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            stringArray[i] = String.valueOf(numbersArray[i]);
        }

        System.out.println(String.join(", ", stringArray));

    }
}
