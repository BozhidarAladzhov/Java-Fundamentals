package Week6ExamPreparation.MoreTasks;

import java.util.Arrays;
import java.util.Scanner;

public class P02MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] elementsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer:: parseInt)
                .toArray();


        String input = scanner.nextLine();

        while (!input.equals("end")){
            int [] indexes = Arrays.stream(input.split(" "))  //индекси на елементите от масива
                    .mapToInt(Integer:: parseInt)
                    .toArray();







            input = scanner.nextLine();
        }




    }
}
