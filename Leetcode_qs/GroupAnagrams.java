package Leetcode_qs;
//LC49

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> solution(String[] strs){
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int num : count){
                key.append('#').append(num);
            }
            String keyStr = key.toString();
            anagramsMap.computeIfAbsent(keyStr, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagramsMap.values());
    }
}
