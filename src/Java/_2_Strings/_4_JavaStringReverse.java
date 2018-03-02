package Java._2_Strings;

import java.util.Scanner;

public class _4_JavaStringReverse
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String A1="";

        char [] a1 = A.toCharArray();
        for(int i=a1.length; i>0; i--)
        {
            A1 += a1[i-1];
        }

        if(A.equals(A1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
