package Week2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        int exhaust = Integer.parseInt(scanner.nextLine()); // Y
        int startPower = power;

        int targetCounter = 0;          // COUNT how many targets you've poked – you'll need that count.

        // M:N, докато N < m - поватящо се действие
        while (power >= distance){

            if (power == startPower /2){
                if (exhaust != 0){
                    power = power / exhaust;
                }
            }else {
                power -= distance;
                targetCounter++;
            }


        }

        System.out.println(power);
        System.out.println(targetCounter);



    }
}
