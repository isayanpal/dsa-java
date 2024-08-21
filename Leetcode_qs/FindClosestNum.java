package Leetcode_qs;

//L2239

public class FindClosestNum {
    public static void main(String[] args) {
        int[] arr = {-4,-2,4,8};
        System.out.println(findClosest(arr));
    }
    public static int findClosest(int[] nums){
        int closest = nums[0];

        for(int x :nums){
            if(Math.abs(x) < Math.abs(closest)){
                closest = x;
            }
        }
        if (closest < 0 && contains(nums, Math.abs(closest))){
            return Math.abs(closest);
        } else {
            return closest;
        }
    }
    private static boolean contains(int[] arr, int value){
        for (int num:arr){
            if (num == value){
                return true;
            }
        }
        return false;
    }
}
