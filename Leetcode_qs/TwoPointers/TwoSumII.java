package Leetcode_qs.TwoPointers;

//LC167
// sorted input array given

public class TwoSumII {
    public int[] twoSum(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target){
                return new int[]{l+1,r+1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        throw new IllegalArgumentException("No two sum found");
    }
}
