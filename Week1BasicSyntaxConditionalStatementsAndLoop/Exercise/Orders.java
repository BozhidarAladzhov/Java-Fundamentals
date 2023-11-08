package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= number; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double priceOrder = (daysInMonth * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);
            totalPrice += priceOrder;

        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
