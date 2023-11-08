package Week3Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLineFirstRow = scanner.nextLine();
        String inputLineSecondRow = scanner.nextLine();

        String [] arrayFirstRow = inputLineFirstRow.split(" ");
        String [] arraySecondRow = inputLineSecondRow.split(" ");

        for (String elementsSecond: arraySecondRow) {
            for (String elementsFirst: arrayFirstRow){
                if (elementsSecond.equals(elementsFirst)){
                    System.out.print(elementsSecond + " ");
                }
            }
        }

    }
}
