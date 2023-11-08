package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String firstArray = "";
        String secondArray = "";
        for (int i = 1; i <= number ; i++) {

            String  [] rowArray = scanner.nextLine().split(" ");

            if ( i % 2 != 0){
                firstArray += rowArray[0] + " ";
                secondArray += rowArray[1] + " ";
            }else {
                firstArray += rowArray[1] + " ";
                secondArray += rowArray[0] + " ";
            }
        }


        System.out.println(firstArray);
        System.out.println(secondArray);

    }
}
