package Java._2_Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _3_JavaSubstringComparisons
{
    public static String getSmallestAndLargest(String s, int k)
    {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int currentIndex = 0;
        ArrayList<String> listString = new ArrayList<>();

        while(currentIndex + k <= s.length())
        {
            listString.add(s.substring(currentIndex,currentIndex+k));
            currentIndex++;
        }

        Collections.sort(listString);
        smallest = listString.get(0);
        largest = listString.get(listString.size()-1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
