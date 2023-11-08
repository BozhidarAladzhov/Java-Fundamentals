package Week1BasicSyntaxConditionalStatementsAndLoop.Lab;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (dayType.equals("Weekday")){
            if (ages >= 0 && ages <= 18){
                price = 12;
                System.out.println(price+"$");
            }else if (ages > 18 && ages <= 64){
                price = 18;
                System.out.println(price+"$");
            }else if (ages > 64 && ages <= 122){
                price = 12;
                System.out.println(price+"$");
            }else {
                System.out.println("Error!");
            }
        }else if (dayType.equals("Weekend")){
            if (ages >= 0 && ages <= 18){
                price = 15;
                System.out.println(price+"$");
            }else if (ages > 18 && ages <= 64){
                price = 20;
                System.out.println(price+"$");
            }else if (ages > 64 && ages <= 122){
                price = 15;
                System.out.println(price+"$");
            }else {
                System.out.println("Error!");
            }

        }else if (dayType.equals("Holiday")){
            if (ages >= 0 && ages <= 18){
                price = 5;
                System.out.println(price+"$");
            }else if (ages > 18 && ages <= 64){
                price = 12;
                System.out.println(price+"$");
            }else if (ages > 64 && ages <= 122){
                price = 10;
                System.out.println(price+"$");
            }else {
                System.out.println("Error!");
            }

        }


    }
}
