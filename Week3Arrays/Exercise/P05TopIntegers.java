package Week3Arrays.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();


        for (int i = 0; i <= array.length-1; i++) {
            int currentNum = array[i];
            if ( i == array.length-1){
                System.out.println(currentNum);
                break;
            }

            boolean isTop = false;

            for (int j = i + 1; j <= array.length -1; j++) {
                if (currentNum > array[j]){
                    isTop = true;
                }else {
                    isTop =false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNum + " ");
            }


        }
        
    }
}
