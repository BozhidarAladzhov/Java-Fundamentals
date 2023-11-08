package Week1BasicSyntaxConditionalStatementsAndLoop.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;

        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHours > 23){
            finalHours = 0;
        }


        if (finalMinutes <=9){
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }else {
            System.out.printf("%d:%d", finalHours, finalMinutes);
        }






    }
}
