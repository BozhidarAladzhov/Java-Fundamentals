package Week4Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operationInput = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operationInput){
            case "add":
                printAdd(operationInput,number1,number2);
                break;
            case "subtract":
                printSubtract(operationInput,number1,number2);
                break;
            case "multiply":
                printMultiply(operationInput,number1,number2);
                break;
            case "divide":
                printDivide(operationInput,number1,number2);
                break;

        }

    }

    public static void printAdd(String input, int n1, int n2) {
        int result = 0;
        if (input.equals("add")) {
            result = n1 + n2;
            System.out.println(result);
        }
    }

    public static void printSubtract(String input, int n1, int n2) {
        int result = 0;
        if (input.equals("subtract")) {
            result = n1 - n2;
            System.out.println(result);
        }
    }

    public static void printMultiply(String input, int n1, int n2) {
        int result = 0;
        if (input.equals("multiply")) {
            result = n1 * n2;
            System.out.println(result);
        }
    }

    public static void printDivide(String input, int n1, int n2) {
        int result = 0;
        if (input.equals("divide")) {
            result = n1 / n2;
            System.out.println(result);
        }
    }


}
