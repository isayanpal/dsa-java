package Strings;
import java.util.*;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//        char at index 0
        System.out.println(sb.charAt(0));

//        set char index o
        sb.setCharAt(0,'P');
        System.out.println(sb);

//        insert char
        sb.insert(0,'S');
        System.out.println(sb);
    }
}
