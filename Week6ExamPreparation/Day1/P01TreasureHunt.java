package Week6ExamPreparation.Day1;

import java.util.*;
import java.util.stream.Collectors;

public class P01TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> treasure = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){

            if (command.contains("Loot")){
                String [] items = command.split(" ");

                for (int i = 1; i < items.length; i++) {
                    if (!treasure.contains(items[i])){
                        treasure.add(0,items[i]);
                    }
                }

            }else if (command.contains("Drop")){
                int indexToDrop = Integer.parseInt(command.split(" ")[1]);
                if (indexToDrop < 0 || indexToDrop > treasure.size()){
                    command = scanner.nextLine();
                    continue;
                }else {
                    String elementToDrop = treasure.get(indexToDrop);
                    treasure.remove(indexToDrop);
                    treasure.add(elementToDrop);
                }

            }else if (command.contains("Steal")){
                int stealCount = Integer.parseInt(command.split(" ")[1]);
                List <String> stealed = new ArrayList<>();
                if (stealCount > treasure.size()-1){
                    for (int i = 0; i < treasure.size(); i++) {
                        String elementToSteal = treasure.get(i);
                        stealed.add(elementToSteal);
                    }
                }else {
                    for (int i = treasure.size() - stealCount; i < treasure.size(); i++) {
                        String elementToSteal = treasure.get(i);
                        stealed.add(elementToSteal);
                    }
                }
                treasure.removeAll(stealed);
                System.out.println(String.join(", ", stealed));

            }

            command = scanner.nextLine();
        }

        int sum =0;
        for (String element:treasure) {
            sum += element.length();

        }

        if (treasure.size() > 0){
            System.out.printf("Average treasure gain: %.2f pirate credits.",sum*1.0 / treasure.size());
        }else {
            System.out.println("Failed treasure hunt.");
        }


    }
}
