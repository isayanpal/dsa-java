package Leetcode_qs.TwoPointers;

//LC15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int low = i+1, high = n-1;
            while (low < high){
                int sum = nums[i] +  nums[low] + nums[high];
                if (sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while ( low < high && nums[low] == nums[low-1] ){
                        low++;
                    }
                    while (low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return ans;
    }
}
