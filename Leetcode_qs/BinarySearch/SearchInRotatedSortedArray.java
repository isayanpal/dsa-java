package Leetcode_qs.BinarySearch;

//LC33

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target){
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while (l < r){
            int m = (l+r)/2;
            if (nums[m] > nums[r]){
                l=m+1;
            }
            else {
                r=m;
            }
        }
        int min_index = l;

        if (min_index == 0){
            l=0;
            r=n-1;
        } else if (target >= nums[0] && target <=nums[min_index-1]) {
            l=0;
            r=min_index-1;
        } else {
            l=min_index;
            r=n-1;
        }

        while(l<=r){
            int m = (l+r)/2;
            if (nums[m]==target){
                return m;
            } else if (nums[m]<target) {
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return -1;
    }
}
