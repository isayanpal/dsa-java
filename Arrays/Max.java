package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {14,87,95,34,2};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 1));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] arr, int start , int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end ; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
