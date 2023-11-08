package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoin = 0;
        double price = 0;


        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                sumCoin += coin;
            }else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }

        if (input.equals("Start")){
            input = scanner.nextLine();
        }

        while (!input.equals("End")){

            if (input.equals("Nuts")){
                price = 2.0;
                if (sumCoin >= price){
                    sumCoin -= price;
                    System.out.println("Purchased Nuts");
                }else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (input.equals("Water")){
                price = 0.7;
                if (sumCoin >= price){
                    sumCoin -= price;
                    System.out.println("Purchased Water");
                }else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (input.equals("Crisps")){
                price = 1.5;
                if (sumCoin >= price){
                    sumCoin -= price;
                    System.out.println("Purchased Crisps");
                }else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (input.equals("Soda")){
                price = 0.8;
                if (sumCoin >= price){
                    sumCoin -= price;
                    System.out.println("Purchased Soda");
                }else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (input.equals("Coke")){
                price = 1.0;
                if (sumCoin >= price){
                    sumCoin -= price;
                    System.out.println("Purchased Coke");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }

        if (input.equals("End")){
            System.out.printf("Change: %.2f",sumCoin);
        }


    }
}
