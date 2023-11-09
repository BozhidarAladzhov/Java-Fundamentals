package Week4Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")){
            palindromeOrNot(inputLine);
            inputLine = scanner.nextLine();
        }


    }

    public static void palindromeOrNot (String inputLine){
        String reverseInput = "";


        for (int i = (inputLine.length()-1); i >=0 ; i--) {
            reverseInput = reverseInput + inputLine.charAt(i);
        }

        if (reverseInput.equals(inputLine)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        
    }

}
