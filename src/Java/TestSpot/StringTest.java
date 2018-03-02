package Java.TestSpot;

import org.apache.commons.lang3.StringUtils;

public class StringTest
{
    public static void main(String[] args) {
        String s1 = "978977_vid1_6.mp4";


        String sku1 = "108076";
        String name1 = "9004811_vid1_all safe tape office_non_new_15 final.mp4";
        String number1 = "1";
        String other1 = "MULTI";


        String sku2 = "107975";
        String name2 = "100196_vid1_6.mp4";
        String number2 = "1";
        String other2 = "MULTI";

        System.out.println(String.format("%8",sku1) + "\t" + name1 + "\t" + number1 + "\t" + other1);
        System.out.println(sku2 + "\t" + name2 + "\t" + number2 + "\t" + other2);

        /*int index = StringUtils.indexOf(s1, "_vid");
        System.out.println(index);

        String leftover = StringUtils.substring(s1,index,index+7);
        System.out.println(leftover);

        String dig = StringUtils.getDigits(leftover);
        System.out.println("Digits: " + dig);


        System.out.println(StringUtils.indexOf(s1,"abc"));*/
    }
}
