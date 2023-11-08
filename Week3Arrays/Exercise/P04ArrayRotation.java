package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int numRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= numRotations; rotations++) {
            int firstElement = arrayNumbers[0];
            for (int elements = 0; elements < arrayNumbers.length; elements++) {
                if (elements < arrayNumbers.length -1) {
                    arrayNumbers[elements] = arrayNumbers[elements + 1];
                } else {
                    arrayNumbers[arrayNumbers.length - 1] = firstElement;
                }

            }


        }
        for (int element : arrayNumbers){
            System.out.print(element + " ");
        }
    }
}
