package Week6ExamPreparation.Day2;

import java.util.*;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Write a program to read a sequence of integers.

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 2. Find the average number.
        double sumArray = 0.0;
        for (int i = 0; i < numbersArr.length; i++) {
            sumArray += numbersArr[i];
        }

        double averageNum = sumArray / numbersArr.length;

        // 3. Find the top 5 numbers and sort them in descending order.
        List<Integer> topNumbers = new ArrayList<>();
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] > averageNum){
                topNumbers.add(numbersArr[i]);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        // 4. Print the top5 numbers, or "No" if there are no top numbers.

        if (topNumbers.size() > 0){
            for (int i = 0; i < topNumbers.size(); i++) {
                if (i > 4){
                    break;
                }
                System.out.print(topNumbers.get(i) + " ");
            }
        }else {
            System.out.println("No");
        }

    }
}
