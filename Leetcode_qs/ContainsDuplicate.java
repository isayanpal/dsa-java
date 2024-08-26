package Leetcode_qs;

//LC217

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean solution(int[] nums){
        Set<Integer> n = new HashSet<>();
        for (int num : nums){
            if (n.contains(num)){
                return true;
            }
            n.add(num);
        }
        return false;
    }
}
