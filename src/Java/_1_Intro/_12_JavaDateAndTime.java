package Java._1_Intro;

import java.time.LocalDate;
import java.util.Scanner;

public class    _12_JavaDateAndTime
{
    public static String getDay(String day, String month, String year) {
        // Write your code here.

        int y = Integer.valueOf(year);
        int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);

        LocalDate ld = LocalDate.of(y,m,d);
        return ld.getDayOfWeek().toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
