package Binary_Search;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class LC34 {

    // this function just returns the index of the index value of the target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            //find the middle element
            // int mid = (start + end) / 2; // might be possible that this may exceed the range of integer
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //possible ans found
                ans = mid;
                if (findStartIndex){
                   end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};

        //check for 1st occurance if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
