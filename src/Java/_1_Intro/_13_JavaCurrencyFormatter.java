package Java._1_Intro;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class _13_JavaCurrencyFormatter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
