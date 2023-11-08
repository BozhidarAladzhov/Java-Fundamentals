package Week2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short snowballs = Short.parseShort(scanner.nextLine());

        int maxSnowballValue = Integer.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality =0;

        for (short i = 1; i <=snowballs ; i++) {

            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            short snowballQuality = Short.parseShort(scanner.nextLine());

            int snowballValue = (int) Math.pow(snowballSnow/snowballTime, snowballQuality);


            if (snowballValue > maxSnowballValue){
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)",maxSnowballSnow,maxSnowballTime,maxSnowballValue,maxSnowballQuality);

    }
}
