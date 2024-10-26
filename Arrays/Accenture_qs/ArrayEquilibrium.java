package Arrays.Accenture_qs;

//The function accepts an integer array ‘arr’ of size ‘n’ as its argument.
// The function needs to return the index of an equilibrium point in the array,
// where the sum of elements on the left of the index is equal to the sum of
// elements on the right of the index. If no equilibrium point exists, the
// function should return -1.

public class ArrayEquilibrium {
    static int findEquilibrium(int arr[], int n){
        int totalSum = 0, leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,3,5,7,3};
        System.out.println(findEquilibrium(arr,n));
    }
}
