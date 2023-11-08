package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;

        for (int i = startNum; i <= endNum ; i++) {
            System.out.print(i + " ");
            sumNum += i;
            if (i == endNum){
                System.out.println();
            }
        }

        System.out.println("Sum: "+ sumNum);

    }
}
