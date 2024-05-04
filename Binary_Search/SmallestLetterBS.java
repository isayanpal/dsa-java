package Binary_Search;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetterBS {
    public static void main(String[] args) {

    }

    // return the index of smallest number >= target
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            //find the middle element
//            int mid = (start + end) / 2; // might be possible that this may exceed the range of integer
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
