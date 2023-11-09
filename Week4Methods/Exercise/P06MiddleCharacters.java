package Week4Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        printMiddleChar(inputLine);

    }

    public static void printMiddleChar (String line){


        if (line.length() % 2 != 0){
            int middleIndex = line.length() /2;
            System.out.println(line.charAt(middleIndex));
        }else {
            int middleIndexFirst = line.length() /2 -1;
            int middleIndexSecond = line.length() /2;

            System.out.print(line.charAt(middleIndexFirst));
            System.out.print(line.charAt(middleIndexSecond));
        }

    }
}
