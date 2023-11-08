package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> цяло число
        int num = Integer.parseInt(scanner.nextLine());
        int startNumber = num; // Първоначалната стойност на числото
        //2. проверка дали числото е силно
        // ако е strong -> yes
        // ако не е strong -> no

        //1. всяка цифра
        //2. факториела на всяка цифра
        //3. сума от факториел

        int sumFact = 0; // сума на фактуриели
        while (num > 0 ){
            int lastDigit = num % 10; // намираме последната цифра на числото
            int fact =1; // намираме фактуриела на lastDigit
            for (int i = 1; i <=lastDigit ; i++) {
                fact = fact *i;
            }
            sumFact += fact;
            num = num / 10; // премахваме последната цифра
        }

        if (sumFact == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
