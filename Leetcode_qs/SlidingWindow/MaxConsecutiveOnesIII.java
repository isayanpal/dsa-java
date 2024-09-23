package Leetcode_qs.SlidingWindow;

//LC1004

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k){
        int max_window = 0;
        int num_zeros = 0;
        int n = nums.length;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if (nums[r] == 0){
                num_zeros += 1;
            }
            while (num_zeros > k){
                if (nums[l] == 0){
                    num_zeros -= 1;
                }
                l += 1;
            }
            int window = r - l + 1;
            max_window = Math.max(max_window,window);
        }
        return max_window;
    }
}
