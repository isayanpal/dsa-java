package Leetcode_qs;

//L392

public class Subsequence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(solution(s,t));
    }
    public static boolean solution (String s, String t){
        int sl = s.length(), tl = t.length();

        int sp = 0, tp = 0;

        while (sp < sl && tp < tl){
            if (s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp == sl;
    }
}
