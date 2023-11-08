package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        boolean areEven = false;

        for (int i = 0; i <= numbersArray.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            if (numbersArray.length == 1) {
                areEven = true;
                System.out.println(0);
                break;
            }

            for (int right = i + 1; right <= numbersArray.length - 1; right++) {
                sumRight += numbersArray[right];

            }
            for (int left = i-1; left >= 0; left--) {
                sumLeft += numbersArray[left];

            }
            if (sumLeft == sumRight) {
                areEven = true;
                System.out.println(i);
                break;
            }
        }


        if (areEven == false) {
            System.out.println("no");
        }
    }
}
