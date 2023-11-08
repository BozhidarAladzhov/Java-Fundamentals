package Week2DataTypesAndVariables.Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int workingNum = i;

            int sum = 0;

            while (currentNum > 0){
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                currentNum = currentNum /10;
            }

            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n",workingNum);
            }else {
                System.out.printf("%d -> False%n", workingNum);
            }

        }


    }
}
