package Arrays.Accenture_qs;

//Given an array of integers, find the maximum subarray sum.
//A subarray is a contiguous subsequence of the array.
//Given an array of integers, such as [-2, 1, -3, 4, -1, 2, 1, -5, 4],
// the algorithm should determine that the maximum subarray
// sum is 6 ([4, -1, 2, 1]).

public class MaxSubArraySum {
    public static int maxSubArraySum(int[] arr){
        int max_so_far = arr[0];
        int max_ending_here = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max_ending_here = Math.max(max_ending_here + arr[i],arr[i]);
            max_so_far = Math.max(max_so_far,max_ending_here);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr =  {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maxium Subarray Sum is  "+ maxSubArraySum(arr));
    }
}

//output:
// Maxium Subarray Sum is  7
