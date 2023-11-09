package Week4Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        String operatorInput = scanner.nextLine();
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println(df.format(calculate(firstNumInput, operatorInput,secondNumInput)));

    }

    private static double calculate (int num1, String operation, int num2){
        double result = 0.0;

        switch (operation){
            case "/":
                result = num1*1.0 / num2;
                break;
            case "*":
                result = num1*1.0 * num2;
                break;
            case "+":
                result = num1*1.0 + num2;
                break;
            case "-":
                result = num1*1.0 - num2;
                break;
        }
        return result;
    }

}
