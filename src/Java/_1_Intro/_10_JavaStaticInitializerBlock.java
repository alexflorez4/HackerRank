package Java._1_Intro;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class _10_JavaStaticInitializerBlock
{

    public static int B = 0;
    public static int H = 0;
    public static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if(B<=0 || H<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args)
    {
        if(flag)
        {
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
