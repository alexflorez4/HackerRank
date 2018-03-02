package Java.TestSpot;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
    public static void main(String[] args) {

        List<String > list = new ArrayList<>();

        list.add("id1"); //0
        list.add(null);  //1
        list.add("id5");  //2
        list.add(null);  //3
        list.add("id2");  //4

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        list.remove(3);
        System.out.println(list.get(3));
    }
}
