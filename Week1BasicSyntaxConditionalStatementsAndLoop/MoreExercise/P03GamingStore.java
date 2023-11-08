package Week1BasicSyntaxConditionalStatementsAndLoop.MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double spentMoney = 0;

        while (!input.equals("Game Time")){
            if (input.equals("OutFall 4")){
                if (currentMoney < 39.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney-= 39.99;
                    spentMoney += 39.99;
                    System.out.println("Bought OutFall 4");
                }

            }else if (input.equals("CS: OG")){
                if (currentMoney < 15.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney-= 15.99;
                    spentMoney += 15.99;
                    System.out.println("Bought CS: OG");
                }

            }else if (input.equals("Zplinter Zell")){
                if (currentMoney < 19.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney -= 19.99;
                    spentMoney += 19.99;
                    System.out.println("Bought Zplinter Zell");
                }

            }else if (input.equals("Honored 2")){
                if (currentMoney < 59.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney -= 59.99;
                    spentMoney += 59.99;
                    System.out.println("Bought Honored 2");
                }

            }else if (input.equals("RoverWatch")){
                if (currentMoney < 29.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney -= 29.99;
                    spentMoney += 29.99;
                    System.out.println("Bought RoverWatch");
                }

            }else if (input.equals("RoverWatch Origins Edition")){
                if (currentMoney < 39.99){
                    System.out.println("Too Expensive");
                }else {
                    currentMoney -= 39.99;
                    spentMoney += 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }

            }else {
                System.out.println("Not found");
            }

            if (currentMoney <= 0){
                System.out.println("Out of money");
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Game Time")){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spentMoney, currentMoney);
        }


    }
}
