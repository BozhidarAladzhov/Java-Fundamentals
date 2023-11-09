package Week4Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();
        printChars(passwordInput);
        printLetterAndDigits(passwordInput);
        printTwoDigits(passwordInput);
        printPasswordIsValid(passwordInput);

    }

    public static void printChars(String pass) {
        if (pass.length() < 6 || pass.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
    }

    public static void printLetterAndDigits(String pass) {
        char[] password = pass.toCharArray();
        for (char c : password) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }

    }

    public static void printTwoDigits(String pass) {
        char[] password = pass.toCharArray();
        int digitCounter = 0;
        for (char c : password) {

            if (Character.isDigit(c)) {
                digitCounter++;
            }

        }

        if (digitCounter < 2) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static void printPasswordIsValid(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            char[] password = pass.toCharArray();
            int digitCounter = 0;
            for (char c : password) {
                if (Character.isLetterOrDigit(c)) {
                }
                if (Character.isDigit(c)) {
                    digitCounter++;
                }
                }
                if (digitCounter >= 2) {
                    System.out.println("Password is valid");
                }
            }

        }

    }

