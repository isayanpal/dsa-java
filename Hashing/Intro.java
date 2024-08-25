package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Intro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("size of set: " + set.size());

        //Search
        if(set.contains(1)){
            System.out.println("present");
        }

        if(!set.contains(6)){
            System.out.println("not present");
        }

        //Delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("absent");
        }

        //print all elements
        System.out.println(set);

        //Iteration - HashSet does not have an order
        set.add(0);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + ", ");
        }
        System.out.println();
        if (!set.isEmpty()){
            System.out.println("set is not empty");
        }
    }
}
