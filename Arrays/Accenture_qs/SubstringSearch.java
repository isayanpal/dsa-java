package Arrays.Accenture_qs;

//The function accepts two strings ‘str1’ and ‘str2’ as its argument.
// The function needs to return the index of the first occurrence of substring
// ‘str2’ in string ‘str1’ or -1 if the substring is not found.

public class SubstringSearch {
    public static int substringSearch(String str1,String str2){
        int index = str1.indexOf(str2);
        return index != -1 ? index:-1;
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        System.out.println(substringSearch(str1,str2));
    }
}

// output :
// 6