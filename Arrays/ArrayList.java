package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(234);
//        list.add(56);
//        list.add(69);
//        System.out.println(list);
//        list.set(0, 19);
//        System.out.println(list);

        //input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //get any item at index
        for (int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
