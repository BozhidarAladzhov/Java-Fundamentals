package Week4Methods.Exercise;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String lowCaseInput = inputLine.toLowerCase();
        printVowels(lowCaseInput);

    }

    // a, e, i , o , u

    public static void printVowels(String text){
        String [] itemsArray = {text};
        int vowelCounter =0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a'||
                    text.charAt(i) == 'e'||
                    text.charAt(i) == 'i'||
                    text.charAt(i) == 'o'||
                    text.charAt(i) == 'u'){
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);

    }
}
