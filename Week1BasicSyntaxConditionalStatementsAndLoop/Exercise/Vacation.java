package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;

        if (groupType.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            }else if (day.equals("Saturday")){
                price = 9.80;
            }else if (day.equals("Sunday")){
                price = 10.46;
            }
            if (groupNumber >= 30){
                price = price - (price * 0.15);
            }

        }else if (groupType.equals("Business")){
            if (day.equals("Friday")){
                price = 10.90;
            }else if (day.equals("Saturday")){
                price = 15.60;
            }else if (day.equals("Sunday")){
                price = 16.0;
            }
            if (groupNumber >= 100){
                groupNumber = groupNumber - 10;
            }

        }else if (groupType.equals("Regular")){
            if (day.equals("Friday")){
                price = 15.0;
            }else if (day.equals("Saturday")){
                price = 20.0;
            }else if (day.equals("Sunday")){
                price = 22.50;
            }
            if (groupNumber >= 10 && groupNumber <= 20){
                price = price - (price*0.05);
            }
        }

        double totalPrice = groupNumber * price;
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
