package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {14,87,95,34,2};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1]= arr[i2];
        arr[i2]= temp;
    }
}
