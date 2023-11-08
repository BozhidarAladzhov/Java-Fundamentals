package Week2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine()); // първи ден

        int storage =0;
        int dayCounter =0;

        while (startYield >= 100){
            storage += startYield - 26;
            startYield -= 10;
            dayCounter ++;

        }


        if (startYield < 100 && storage >= 26){
            storage -= 26;
        }

        System.out.println(dayCounter);
        System.out.println(storage);

        // колко дена и колко подправки са събрали



    }
}
