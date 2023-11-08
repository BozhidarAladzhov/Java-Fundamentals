package Week2DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int workingNum = 0;
        boolean specialNum = false;
        for (int currentNum = 1; currentNum <= numbers; currentNum++) {
            workingNum = currentNum;
            int sum = 0;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            specialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> False%n", workingNum);



        }
    }
}
