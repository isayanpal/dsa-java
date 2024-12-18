package Leetcode_qs.HashmapSets;

//LC169

public class MajorityElement {
    public int solution(int[] nums){
        int candidate = nums[0];
        int count = 0;

        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1 ;
        }
        return candidate;
    }
}
