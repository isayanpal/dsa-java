package Leetcode_qs;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int solution(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        int longest = 0;

        for (int num : set){
            if (!set.contains(num - 1)){
                int length = 1;
                int nextNum = num+1;
                while (set.contains(nextNum)){
                    length++;
                    nextNum++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
