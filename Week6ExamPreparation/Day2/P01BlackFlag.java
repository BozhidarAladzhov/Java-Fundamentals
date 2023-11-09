package Week6ExamPreparation.Day2;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a program that checks if target plunder is reached.

        // First, you will receive how many days the pirating lasts.
        int days = Integer.parseInt(scanner.nextLine());
        // Then you will receive how much the pirates plunder for a day.
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        // Last you will receive the expected plunder at the end.
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double gatherPlunder = 0;

        for (int i = 1; i <= days; i++) {
            gatherPlunder += dailyPlunder;

            if (i % 3 == 0){
                gatherPlunder += dailyPlunder * 0.5;

            }
            if (i % 5 == 0) {
                gatherPlunder = gatherPlunder - (gatherPlunder * 0.3);
            }
        }

        if (gatherPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",gatherPlunder);
        }else {
            double percentOfPlunder = (gatherPlunder/expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfPlunder);
        }


    }
}
