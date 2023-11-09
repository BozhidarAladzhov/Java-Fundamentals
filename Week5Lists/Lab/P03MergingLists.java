package Week5Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbersFirstLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> numbersSecondLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List <Integer> result = new ArrayList<>();
        int minSize = Math.min(numbersFirstLine.size(), numbersSecondLine.size());

        for (int i = 0; i < minSize; i++) {
            int firstItem = numbersFirstLine.get(i);
            int secondItem = numbersSecondLine.get(i);

            result.add(firstItem);
            result.add(secondItem);
        }

        if (numbersFirstLine.size() > numbersSecondLine.size()){
            result.addAll(numbersFirstLine.subList(minSize, numbersFirstLine.size()));
        }else {
            result.addAll(numbersSecondLine.subList(minSize, numbersSecondLine.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));


    }
}
