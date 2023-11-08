package Week1BasicSyntaxConditionalStatementsAndLoop.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int position = username.length() -1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String inputPas = scanner.nextLine();
        int counter = 1;

        while (!inputPas.equals(password)){
            System.out.println("Incorrect password. Try again.");
            counter ++;
            if (counter == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            inputPas = scanner.nextLine();
        }

        if (inputPas.equals(password)){
            System.out.printf("User %s logged in.", username);
        }

    }
}
