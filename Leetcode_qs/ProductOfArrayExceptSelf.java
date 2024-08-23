package Leetcode_qs;

//LC238

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.print(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] nums){
        int leftProduct = 1, rightProduct = 1;
        int n = nums.length;
        int[] result = new int[n];

        // calculate the left product
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        //calculate the right product and final result
        for (int i = n-1; i >= 0 ; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}
