package Week1BasicSyntaxConditionalStatementsAndLoop.Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddNumbers = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;

        for (int i = 1; i < oddNumbers * 2; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                sumNum += i;
            }

        }
        System.out.printf("Sum: %d", sumNum);

    }
}
