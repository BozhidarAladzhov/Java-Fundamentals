package Week3Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int [] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int sum = 0;
        boolean areIdentical = true;


        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]){
                sum += firstArray[i];
            }else{
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }

        }

        if (areIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
