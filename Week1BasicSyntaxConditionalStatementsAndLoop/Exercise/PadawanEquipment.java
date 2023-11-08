package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        // 10% допълнителни lightsabers
        // всеки 6-ти колан е безплатен
        double neededLightsabers = students + (students*0.1);
        double sumPriceLightsabers = Math.ceil(neededLightsabers) * lightsaberPrice;
        double sumRobePrice = robePrice * students;
        int freeBelts = students / 6;
        double sumBeltPrice = (students - freeBelts) * beltPrice;

        double totalSum = sumBeltPrice + sumRobePrice + sumPriceLightsabers;

        if (amountMoney >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - amountMoney);
        }






    }
}
