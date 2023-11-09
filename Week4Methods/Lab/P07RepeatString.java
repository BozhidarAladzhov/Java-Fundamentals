package Week4Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int repeatInput = Integer.parseInt(scanner.nextLine());
        System.out.println(getRepeatedString(textInput,repeatInput));


    }

    public static String getRepeatedString (String text, int num){
        String finalText = "";
        for (int i = 1; i <=num ; i++) {
            finalText += text;
        }
        return finalText;
    }

}
