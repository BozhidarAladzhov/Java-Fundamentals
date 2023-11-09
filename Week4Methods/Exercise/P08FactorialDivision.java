package Week4Methods.Exercise;


import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());

        printDivision(firstNumberInput, secondNumberInput);


    }

    public static void printDivision (int num1, int num2) {

        long firstNumFact = 1;
        long secondNumFact = 1;

        for (long i = 1; i <= num1; i++) {
            firstNumFact *= i;
        }

        for (long i = 1; i <= num2 ; i++) {
            secondNumFact *= i;
        }

        double sum = firstNumFact *1.0 / secondNumFact;
        System.out.printf("%.2f",sum);

    }
}
