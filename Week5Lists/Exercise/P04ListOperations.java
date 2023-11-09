package Week5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){



            if (command.contains("Add")){
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);

            }else if (command.contains("Insert")){
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                if (indexToInsert >= 0 && indexToInsert <= numbers.size() -1){
                    numbers.add(indexToInsert,numToInsert);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Remove")){
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (indexToRemove >= 0 && indexToRemove <= numbers.size() -1){
                    numbers.remove(indexToRemove);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Shift left")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count ; i++) {
                    int firstNum = numbers.get(0);
                    numbers.add(firstNum);
                    numbers.remove(0);
                }
                
            }else if (command.contains("Shift right")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count ; i++) {
                    int lastNum = numbers.get(numbers.size()-1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size()-1);
                }
            }
            command = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num + " ");
        }

    }
}
