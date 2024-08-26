package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {
    public static void main(String[] args) {
        //country(key, population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        //update (if exist, re insert)
        map.put("China",180);
        System.out.println(map);

        //search
//        if (map.containsKey("Indonesia")){
//            System.out.println("key present in the map");
//        } else {
//            System.out.println("key not present in the map");
//        }
//
//        // to get the value of the key
//        System.out.println(map.get("China")); // key exists
//        System.out.println(map.get("Indonesia")); // key not exist

        // different iteration methods
//        int arr[] = {12,15,16};
//        for (int i = 0; i < 3; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for (int val : arr){
//            System.out.print(val + " ");
//        }
//        System.out.println();

        //for loop for hashmaps
        // Map.Entry<Integer,Integer> e : Map.entrySet()

        //for(int val : arr)
        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //another method - through keySet
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }


        // remove
        map.remove("China");
        System.out.println(map);
    }
}
