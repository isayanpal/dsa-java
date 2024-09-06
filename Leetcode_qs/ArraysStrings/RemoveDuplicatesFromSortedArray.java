package Leetcode_qs.ArraysStrings;

//LC26

public class RemoveDuplicatesFromSortedArray {
    public static int solution(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
