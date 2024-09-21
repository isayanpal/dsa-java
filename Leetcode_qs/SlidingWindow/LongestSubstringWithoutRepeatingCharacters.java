package Leetcode_qs.SlidingWindow;

//LC3

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        int l = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            int window = r-l+1;
            longest = Math.max(longest,window);
            set.add(s.charAt(r));
        }
        return longest;
    }
}
