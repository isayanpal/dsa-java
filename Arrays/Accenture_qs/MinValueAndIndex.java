package Arrays.Accenture_qs;

//Given an integer array, find the minimum value and its index in the array.

public class MinValueAndIndex {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        int min = arr[0], index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index=i;
            }
        }
        System.out.println("Minimum number in the array: "+min+", index: "+index);
    }
}
