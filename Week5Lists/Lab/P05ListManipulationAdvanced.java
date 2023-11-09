package Week5Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals ("end")){

            if (command.contains("Contains")){
                printIfContains(numbers, command);
            }else if (command.contains("Print even")){
                printEvenNums(numbers);
            }else if (command.contains("Print odd")){
                printOddNums(numbers);
            }else if (command.contains("Get sum")){
                printSumNums (numbers);
            }else if (command.contains("Filter")){
                printFilter(numbers,command);
            }
            command = scanner.nextLine();

        }

    }

    public static void printIfContains (List <Integer> numbers, String command) {
        int numberToContain = Integer.parseInt(command.split(" ")[1]);
        boolean contain = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == numberToContain) {
                contain = true;
                System.out.println("Yes");
                break;
            }
        }
        if (contain == false) {
            System.out.println("No such number");
        }
    }

    public static void printEvenNums (List<Integer> numbers){
        List <Integer> evenList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if ( numbers.get(i) % 2 == 0){
                evenList.add(numbers.get(i));
            }
        }

        for (int num:evenList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printOddNums (List<Integer> numbers){
        List <Integer> oddList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if ( numbers.get(i) % 2 != 0){
                oddList.add(numbers.get(i));
            }
        }

        for (int num:oddList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printSumNums(List <Integer> numbers){
        int totalSum =0;
        for (Integer number : numbers) {
            totalSum += number;
        }
        System.out.println(totalSum);
    }

    public static void printFilter(List <Integer> numbers, String command) {
        String operation = command.split(" ")[1];
        int filteredNum = Integer.parseInt(command.split(" ")[2]);
        List <Integer> filteredNums = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (operation.equals("<")){
                if (numbers.get(i) < filteredNum){
                    filteredNums.add(numbers.get(i));
                }
            }else if (operation.equals(">")){
                if (numbers.get(i) > filteredNum) {
                    filteredNums.add(numbers.get(i));
                }
            }else if (operation.equals(">=")){
                if (numbers.get(i) >= filteredNum){
                    filteredNums.add(numbers.get(i));
                }
            }else if (operation.equals("<=")){
                if (numbers.get(i) <= filteredNum){
                    filteredNums.add(numbers.get(i));
                }
            }
        }

        for (int num : filteredNums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
