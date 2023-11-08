package Week3Arrays.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrayDaysOfWeek = {
                "Monday", // 0 позиция
                "Tuesday", // 1 позиция
                "Wednesday", // 2 позиция
                "Thursday", // 3 позиция
                "Friday", // 4 позиция
                "Saturday", // 5 позиция
                "Sunday", // 6 позиция
        };

        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7){
            System.out.println(arrayDaysOfWeek[day-1]);
        }else {
            System.out.println("Invalid day!");
        }



    }
}
