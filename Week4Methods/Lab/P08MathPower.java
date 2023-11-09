package Week4Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        int raiseInput = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println(df.format(getRaisedNumber(numberInput,raiseInput)));

    }

    public static double getRaisedNumber(double num, int raise){

        return Math.pow(num, raise);
    }
}
