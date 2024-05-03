package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        Scanner in = new Scanner(System.in);

        //input
        for(int row=0; row <arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
        }
        //output
//        for(int row=0; row<arr.length; row++){
//            for (int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] +" ");
//            }
//            System.out.println();
//        }
        //alternate way to print output , converting it to String
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
