package Week3Arrays.Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Find and read an array of Integers.
        int [] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        // 2. Create a cycle to reach every number from the Array.
        // 2.1 Create a new array to collect the longest sequence.


        int length = 1; // how long is the sequence
        int maxLength = 0; // how long is the maxSequence

        int startIndex = 0;
        int bestStartIndex = 0;


        for (int indexFirstElement = 1; indexFirstElement < numbersArray.length; indexFirstElement++) {
            if (numbersArray[indexFirstElement] == numbersArray[indexFirstElement -1]){
                length++;
            }else {
                length = 1;
                startIndex = indexFirstElement;
            }

            if (length > maxLength){
                maxLength = length;
                bestStartIndex = startIndex;
            }

        }

        for (int i = bestStartIndex; i < bestStartIndex + maxLength ; i++) {
            System.out.print(numbersArray[i] + " ");
        }


    }
}
