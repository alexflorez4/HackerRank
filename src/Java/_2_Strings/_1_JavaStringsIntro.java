package Java._2_Strings.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class _1_JavaStringsIntro
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
