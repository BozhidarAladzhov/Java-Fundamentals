package Week6ExamPreparation.Day1;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int winCounter = 0;
        int totalEnergy = initialEnergy;
        boolean ifEnergy = true;

        while (!input.equals("End of battle")){
            int energyDistance = Integer.parseInt(input);

            if (totalEnergy - energyDistance < 0){
                ifEnergy = false;
                break;
            }else {
                winCounter++;
                totalEnergy = totalEnergy - energyDistance;
                if (winCounter % 3 == 0){
                    totalEnergy = totalEnergy + winCounter;
                }
            }
            input = scanner.nextLine();
        }

        if (ifEnergy){
            System.out.printf("Won battles: %d. Energy left: %d ",winCounter, totalEnergy);
        }else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winCounter, totalEnergy);
        }


    }
}
