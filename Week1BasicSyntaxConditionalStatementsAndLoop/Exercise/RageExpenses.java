package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // всяка втора загубена игра чупи -> слушалките
        // всяка трета загубена игра чупи - > мишката

        //на всяка 6-тата загубена игра чупи - > клавиатурата

        // на всяка  12-тата загубена игра чупи - > дисплея

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());


        int headsetCounter = lostGames /2;
        int mouseCounter = lostGames / 3;
        int keyboardCounter = lostGames / 6;
        int displayCounter = lostGames / 12;

        double totalDamages = (headsetPrice * headsetCounter) + (mouseCounter*mousePrice) + (keyboardCounter*keyboardPrice) + (displayCounter*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalDamages);

    }
}
