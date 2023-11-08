package Week2DataTypesAndVariables.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05PrintPartOfTheAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine()); // код от който започваме
        int endCode = Integer.parseInt(scanner.nextLine()); // код в който трябва да приключим

        for (int code = startCode; code <=endCode ; code++) {
            System.out.print((char) code + " ");

        }


    }
}
