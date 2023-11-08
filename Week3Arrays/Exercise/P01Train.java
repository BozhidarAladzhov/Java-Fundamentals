package Week3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int [] peopleArray = new int[wagons];
        int sum =0;

        for (int i = 0; i < wagons; i++) {
            peopleArray[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleArray[i];
            System.out.printf("%d ", peopleArray[i]);
        }

        System.out.printf("%n%d",sum);

    }
}
