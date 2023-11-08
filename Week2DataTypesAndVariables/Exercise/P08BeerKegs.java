package Week2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой на кегове за бира

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int keg = 1; keg <= n; keg++) {
            String model = scanner.nextLine(); // име на кег
            double radius = Double.parseDouble(scanner.nextLine()); // радиус на кега
            int height = Integer.parseInt(scanner.nextLine()); // височината на кега

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = model;
            }


        }

        System.out.println(maxModel);

    }
}
