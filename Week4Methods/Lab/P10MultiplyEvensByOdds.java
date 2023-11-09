package Week4Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvenAndOdds(number));


    }

    private static int getMultipleOfEvenAndOdds(int num){
        int evenSum = getSumEven(num);
        int oddSum = getSumOdd(num);

        return evenSum * oddSum;

    }

    private static int getSumEven(int num){
        int sumEven = 0;
        while (!(num == 0)){
            int currentDigit = num % 10;
            if (currentDigit % 2 == 0 ){
                sumEven+= currentDigit;
            }
            num = num / 10;
        }
        return sumEven;
    }

    private static int getSumOdd(int num){
        int sumOdd = 0;
        while (!(num == 0)){
            int currentDigit = num % 10;
            if (currentDigit % 2 != 0 ){
                sumOdd+= currentDigit;
            }
            num = num / 10;
        }
        return sumOdd;
    }
}
