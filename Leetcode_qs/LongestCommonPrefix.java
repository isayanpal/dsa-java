package Leetcode_qs;

//LC14

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution(strs));
    }
    public static String solution(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }

        int min_length = Integer.MAX_VALUE;
        for (String s: strs){
            if (s.length() < min_length){
                min_length = s.length();
            }
        }
        int i = 0;
        while (i < min_length){
            for (String s : strs){
                if (s.charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}
