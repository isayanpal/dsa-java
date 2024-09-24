package Leetcode_qs.SlidingWindow;

//LC209

public class MinimumSizeSubarraySum {
    public int minSubArrayLength(int target, int[] nums){
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target){
                minLength = Math.min(minLength,r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
