package Week3Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 ==0){
                sum += numbersArray[i];
            }
        }

        System.out.println(sum);


    }
}
