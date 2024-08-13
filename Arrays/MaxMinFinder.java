package Arrays;

public class MaxMinFinder {
//    A = input array
//    N = array size
    public static int setmin(int[] A, int N){
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if(A[i] < mini){
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setmax(int[] A, int N){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum element->" + setmin(A,N));
        System.out.println("Maximum element->" + setmax(A,N));
    }
}
