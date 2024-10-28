package Arrays.Accenture_qs;

//Given a string str, a character ch1, and a character ch2, replace all
// occurrences of ch1 in str with ch2 and vice versa.

public class CharacterReplacement {
    public static String replaceCharacters(String str,char ch1, char ch2){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch1){
                charArray[i] = ch2;
            } else if (charArray[i] == ch2) {
                charArray[i] = ch1;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 ='p';
        String modifiedStr = replaceCharacters(str,ch1,ch2);
        System.out.println("Modified string: " + modifiedStr);
    }
}
