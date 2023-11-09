package Week4Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1Input = Integer.parseInt(scanner.nextLine());
        int n2Input = Integer.parseInt(scanner.nextLine());
        int n3Input = Integer.parseInt(scanner.nextLine());

        int summedNumbers = sumNumbers(n1Input,n2Input);
        System.out.println(subtractNumbers(summedNumbers,n3Input));


    }

    public static int sumNumbers (int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

    public static int subtractNumbers (int summedNumbers , int n3){
        int subtractNum = summedNumbers - n3;
        return  subtractNum;
    }


}
