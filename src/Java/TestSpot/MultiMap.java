package Java.TestSpot;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.Iterator;

public class MultiMap
{
    public static void main(String[] args) {

        Multimap<String, MapBean> allSkuToStateMap = ArrayListMultimap.create();

        MapBean mb1 = new MapBean();
        MapBean mb2 = new MapBean();
        MapBean mb3 = new MapBean();

        mb1.setName("name1");
        mb1.setLastname("lastname1");

        mb2.setName("name2");
        mb2.setLastname("lastname2");

        mb3.setName("name3");
        mb3.setLastname("lastname3");

        allSkuToStateMap.put("id1", mb1);
        allSkuToStateMap.put("id2", mb2);
        allSkuToStateMap.put("id3", mb3);
        System.out.println("Initial Size: " + allSkuToStateMap.size());

        for(String mb : allSkuToStateMap.keySet()){
            System.out.println("Size: " + allSkuToStateMap.size());
            Collection<MapBean> res = allSkuToStateMap.get(mb);

            for(MapBean element : res){
                System.out.println("Key: " + mb + " - Last Name: " + element.getLastname());
                allSkuToStateMap.remove(mb, element);
            }

            System.out.println("Size: " + allSkuToStateMap.size());

        }
        System.out.println("Final Size: " + allSkuToStateMap.size());
    }
}
