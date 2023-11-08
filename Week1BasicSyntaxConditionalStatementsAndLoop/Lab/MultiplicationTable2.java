package Week1BasicSyntaxConditionalStatementsAndLoop.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            int sum1 = num * multiplier;
            System.out.printf("%d X %d = %d%n",num, multiplier, sum1);
        }else {
            for (int i = multiplier; i <= 10; i++) {
                int sum = num * i;
                System.out.printf("%d X %d = %d%n",num, i, sum);
            }
        }




    }

}

