package Arrays.Accenture_qs;

//The function accepts a string ‘str’ as its argument.
// The function needs to determine whether the string is a palindrome or not.
// A palindrome is a word or phrase that reads the same backward as forward.

public class PalindromeCheck {
    static boolean isPalindrome (String str){
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
