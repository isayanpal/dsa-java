package Arrays.Accenture_qs;

//The function accepts an integer array ‘arr’ of size ‘n’ as its argument.
// Each element of ‘arr’ represents the number of chocolates distributed to a person.
// The function needs to return the minimum number of chocolates that need to be distributed
// to each person so that the difference between the chocolates of any two people is minimized.

import java.util.Arrays;

public class ChocolateDistribution {
    public static int minChocolates(int[] arr){
        Arrays.sort(arr);

        int minDiff = arr[arr.length - 1]- arr[0];
        for (int i = 0; i <= arr.length-5; i++) {
            minDiff = Math.min(minDiff,arr[i+4]-arr[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,12,3,1};
        int res = minChocolates(arr);
        System.out.println(res);
    }
}

//output:
// 11
