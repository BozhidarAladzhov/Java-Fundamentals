package Week5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive a single input line containing STRINGS separated by spaces.
        List <String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        String result = " ";
        while (!command.equals("3:1")){

            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (endIndex > inputList.size()-1 || endIndex < 0){
                    endIndex = inputList.size()-1;
                }
                if (startIndex < 0 || startIndex > inputList.size()-1){
                    startIndex = 0;
                }

                for (int i = startIndex; i < endIndex; i++) {

                    String currentElement = inputList.get(startIndex);
                    result += currentElement;
                    inputList.remove(startIndex);
                }
                inputList.set(startIndex, result);


            }else if (command.contains("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
            }


            command = scanner.nextLine();
        }

    }
}
