package Java._1_Intro;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class _9_JavaEndOfFile
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (scanner.hasNext())
        {
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
    }
}
