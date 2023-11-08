package Week3Arrays.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();




        int [] condensed = new int[array.length - 1];

        while ( array.length > 1 ){
            for (int i = 0; i < array.length ; i++) {
                condensed[i] = array[i] + array [i +1];
                if (i == condensed.length-1){
                    array = condensed.clone();
                    if (array.length > 1){
                        condensed = new int[array.length -1];
                    }
                    break;

                }

            }
        }


        System.out.println(array[0]);





    }
}
