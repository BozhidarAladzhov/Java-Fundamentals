package Week5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        while (firstHand.size() != 0 && secondHand.size() !=0 ){


            // проверяваме коя карта печели, печелившата взима двете.
            if (firstHand.get(0) > secondHand.get(0)){
                firstHand.add(firstHand.get(0));
                firstHand.add(secondHand.get(0));
                firstHand.remove(0);
                secondHand.remove(0);


            } else if (secondHand.get(0) > firstHand.get(0)){
                secondHand.add(secondHand.get(0));
                secondHand.add(firstHand.get(0));
                firstHand.remove(0);
                secondHand.remove(0);

            }else if (firstHand.get(0).equals(secondHand.get(0))){
                firstHand.remove(0);
                secondHand.remove(0);

            }
        }


        if (firstHand.size() > secondHand.size()){
            int sum = 0;
            for (int cards:firstHand) {
                sum += cards;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            int sum = 0;
            for (int cards:secondHand) {
                sum += cards;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }




    }
}
