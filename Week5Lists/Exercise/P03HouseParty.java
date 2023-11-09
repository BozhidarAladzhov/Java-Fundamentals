package Week5Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();


        for (int i = 1; i <= commands; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            boolean isInTheList = list.contains(name);

            if (command.contains("is going")) {
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }

            }else if (command.contains("is not going")){
                if (isInTheList){
                    list.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }


        }

        for (String guest:list) {
            System.out.println(guest);
        }
    }
}
