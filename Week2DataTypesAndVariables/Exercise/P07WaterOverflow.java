package Week2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int capacity = 255; // Water Tank capacity
        int startCapacity =0;

        for (int operations = 1; operations <=input ; operations++) {
            int liters = Integer.parseInt(scanner.nextLine());
            startCapacity += liters;

            if (startCapacity > 255){
                System.out.println("Insufficient capacity!");
                startCapacity -= liters;

            }

        }

        System.out.println(startCapacity);



    }
}
