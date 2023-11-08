package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create and ready an array of integers.
        // 1.1 Given number.

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(scanner.nextLine());

        //2. Create a cycle to reach every number from the Array and take the current Number.
        //2.3 Create second cycle to reach every next number and check if the sum is equal to "target".

        for (int index = 0; index < numbers.length; index++) {
            int currentNum = numbers[index];
            for (int indexNextNum = index+1; indexNextNum < numbers.length; indexNextNum++) {
                int nextNum = numbers[indexNextNum];
                if (currentNum + nextNum == target){
                    System.out.println(currentNum + " " + nextNum);
                }
            }

        }




    }
}
