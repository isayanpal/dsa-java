package Leetcode_qs.HashmapSets;
//LC242

import java.util.HashMap;

public class ValidAnagram {
    public boolean solution(String s,String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        }

        for (char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        return sMap.equals(tMap);
    }
}
