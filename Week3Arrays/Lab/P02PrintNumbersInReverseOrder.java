package Week3Arrays.Lab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine()); //броя на числата (масива) който ще прочетем

        int [] arrayNumbers = new int[numbers]; // създаваме масив, с дължина
        for (int i = 0; i < numbers; i++) { //запълваме масива със стойности, за всеки нов прочетен ред.
            arrayNumbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = arrayNumbers.length -1; i >= 0  ; i--) {
            System.out.print(arrayNumbers[i] + " ");
        }

    }
}
