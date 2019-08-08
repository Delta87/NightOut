package utils;

import java.text.DecimalFormat;
import java.util.Random;

public class Tools {
    public static int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        int result = r.nextInt(max-min) + min;
        return result;
    }

    public static void printFormat(String pText, float pFloat, int decimal)
    {
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(decimal);
        df.setMaximumFractionDigits(decimal);
        pText = pText.replace("%f", df.format(pFloat));
        System.out.printf("%s\n", pText);
    }
    public static void printFormat(String pText, int pInt)
    {
        pText = pText.replace("%i", String.format("%s", pInt));
        System.out.printf("%s\n", pText);
    }
    public static void printFormat(String pText, double pDouble, int decimal)
    {
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(decimal);
        df.setMaximumFractionDigits(decimal);
        pText = pText.replace("%d", df.format(pDouble));
        System.out.printf("%s\n", pText);

    }
    public static void printFormat(String pText)
    {
        System.out.printf("%s\n", pText);
    }

}
