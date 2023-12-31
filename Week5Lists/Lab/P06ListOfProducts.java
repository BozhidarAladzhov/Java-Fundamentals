package Week5Lists.Lab;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();


        for (int i = 1; i <= number ; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < number; i++) {
            System.out.printf("%d.%s%n", i+1, products.get(i));
        }

    }
}
