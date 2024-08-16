package Strings;
//L344
public class ReverseArrayOfStrings {
//    using StringBuilder
     static void reverseBuilder(char[] s){
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
         System.out.println(
                 sb
         );
    }
//    using swap approach
    static void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;

//            move towards the center
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        reverseBuilder(s);
    }
}
