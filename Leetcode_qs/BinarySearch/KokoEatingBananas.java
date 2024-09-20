package Leetcode_qs.BinarySearch;

//LC875

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h){
        int left = 1;
        int right = Arrays.stream(piles).max().orElse(1);

        while (left < right){
            int mid = (left + right) / 2;
            if (canFinish(piles,h,mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canFinish(int[] piles, int h, int k){
        int hours = 0;
        for (int pile:piles){
            hours += (pile + k - 1)/k;
        }
        return hours <= h;
    }
}
