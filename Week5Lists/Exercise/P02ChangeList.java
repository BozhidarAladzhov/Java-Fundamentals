package Week5Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Delete")){
                int numToDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numToDelete));
            }else if (command.contains("Insert")){
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.add(indexToInsert, numToInsert);
            }

            command = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num + " ");
        }

    }
}
