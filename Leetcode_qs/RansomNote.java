package Leetcode_qs;

//LC383

import java.util.HashMap;

public class RansomNote {
    public boolean solution(String ransomNote, String magazine){
        HashMap<Character,Integer> counter = new HashMap<>();

        for (char c : magazine.toCharArray()){
            counter.put(c, counter.getOrDefault(c,0)+1);
        }

        for (char c : ransomNote.toCharArray()){
            if (!counter.containsKey(c) || counter.get(c) == 0){
                return false;
            }
            counter.put(c,counter.get(c)-1);
        }
        return true;
    }
}
