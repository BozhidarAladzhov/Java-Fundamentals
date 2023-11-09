package Week4Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        switch (typeInput){
            case "int":
                int int1 = Integer.parseInt(scanner.nextLine());
                int int2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(int1, int2));
                break;
            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(char1,char2));
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                System.out.println(getMax(str1,str2));
                break;
        }


    }

    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }

    }

    public static char getMax(char char1, char char2){
        if (char1 > char2){
            return char1;
        }else {
            return char2;
        }

    }

    public static String getMax(String str1, String str2){
        if (str1.compareTo(str2) >= 0){
            return str1;
        }else {
            return  str2;
        }
    }

}
