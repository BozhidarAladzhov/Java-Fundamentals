package Week6ExamPreparation.MoreTasks;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double sumPrice = 0;

        while (!input.equals("special") && !input.equals("regular")){

            double partPrice = Double.parseDouble(input);

            if (partPrice < 0){
                System.out.println("Invalid price!");
            }else {
                sumPrice += partPrice;
            }

            input = scanner.nextLine();
        }




        double taxes = sumPrice * 0.2;
        double finalSum = sumPrice + taxes;

        if (input.equals("special")){
            double discountSum = (sumPrice + taxes) * 0.1;
            finalSum = finalSum - discountSum;

        }

        if (sumPrice == 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", finalSum );
        }






    }
}
