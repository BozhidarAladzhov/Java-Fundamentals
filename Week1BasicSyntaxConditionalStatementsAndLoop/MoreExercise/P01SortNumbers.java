package Week1BasicSyntaxConditionalStatementsAndLoop.MoreExercise;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        int maxNum = Integer.MAX_VALUE;
        int minNum = Integer.MIN_VALUE;
        int midNum =0;


        if (num1 > num2 && num1 > num3 && num1 < maxNum){
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3 && num2 <maxNum) {
            maxNum = num2;
        }else if (num3 > num2 && num3 > num1 && num3 <maxNum){
            maxNum = num3;
        }

        if (num1 <= num2 && num1 <= num3 && num1 > minNum){
            minNum = num1;
        } else if (num2 <= num1 && num2 <= num3 && num2 > minNum) {
            minNum = num2;
        }else if (num3 <= num2 && num3 <= num1 && num3 > minNum){
            minNum = num3;
        }

        if (num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3 ){
            midNum = num1;
        } else if (num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3){
            midNum = num2;
        }else if (num3 <= num1 && num3 >= num2 || num3 >= num1 && num3 <= num2){
            midNum = num3;
        }

        System.out.println(maxNum);
        System.out.println(midNum);
        System.out.println(minNum);






    }
}

