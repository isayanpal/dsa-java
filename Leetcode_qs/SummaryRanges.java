package Leetcode_qs;

//LC228

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(solution(nums));
    }
    public static List<String> solution(int[] nums){
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while (i < n){
            int start = nums[i];
            while (i < n - 1 && nums[i] + 1 == nums[i + 1]){
                i++;
            }
            if (start != nums[i]){
                ans.add(start + "->" + nums[i]);
            } else {
                ans.add(String.valueOf(nums[i]));
            }
            i++;
        }
        return ans;
    }
}
