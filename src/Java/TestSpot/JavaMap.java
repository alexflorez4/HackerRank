package Java.TestSpot;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

    public static void main(String[] args) {

        Map<String, MapBean> map = new HashMap<>();

        MapBean mb1 = new MapBean();
        MapBean mb2 = new MapBean();
        MapBean mb3 = new MapBean();

        mb1.setName("name1");
        mb1.setLastname("lastname1");

        mb2.setName("name2");
        mb2.setLastname("lastname2");

        mb3.setName("name3");
        mb3.setLastname("lastname3");


        map.put("id1", mb1);
        map.put("id2", mb2);
        map.put("id1", mb1);

        System.out.println(map.size());
        for(String mb : map.keySet()){

            System.out.println(mb);
            MapBean res = map.get(mb);
        }

        //map.remove("id1");
        map.remove("id2");
        System.out.println(map.size());

        System.out.println(map.get("id1").getName());
        map.get("id1").setName("Name 1 changed");
        System.out.println(map.get("id1").getName());
    }
}
