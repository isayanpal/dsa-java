package Leetcode_qs;

//LC771

import java.util.HashSet;

public class JewelsAndStones {
    public int solution(String jewels, String stones){
        HashSet<Character> jewelSet = new HashSet<>();

        for (char j : jewels.toCharArray()){
            jewelSet.add(j);
        }

        int count = 0;
        for (char s : stones.toCharArray()){
            if (jewelSet.contains(s)){
                count++;
            }
        }
        return count;
    }
}
