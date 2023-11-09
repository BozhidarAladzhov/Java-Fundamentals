package Week4Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputLineOne = scanner.nextLine().charAt(0);
        char inputLineTwo = scanner.next().charAt(0);

        printCharsBetween(inputLineOne,inputLineTwo);


    }

    public static void printCharsBetween (char ch1, char ch2){

        for (int i = ch1+1; i <ch2 ; i++) {
            char current = (char)i;
            System.out.print(current + " ");
        }

        for (int i = ch2+1; i <ch1 ; i++) {
            char current = (char)i;
            System.out.print(current + " ");
        }

    }
}
