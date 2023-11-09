package Week4Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());




        for (int i = 1; i <= numberInput; i++) {


            boolean isDivisible = isSumDivisibleBy8(i);
            boolean isOddDigit = isThereOneOddDigit(i);

            if (isDivisible && isOddDigit){
                System.out.println(i);
            }

        }




    }

    public static boolean isSumDivisibleBy8 (int number){
        int sum= 0;

        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number /10;
        }
        return sum % 8 == 0;
    }

    public static boolean isThereOneOddDigit (int number) {

        while (number >0){
            int lastDigit = number % 10;

            if (lastDigit % 2 !=0){
                return true;
            }else {
                number /= 10;
            }
        }
        return false;
    }






}
