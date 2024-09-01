package Graphs.questions;

import java.util.Arrays;
import java.util.List;

public class MaxWeightCell {
    //function to find Max Weight Cell
    static int maxWeightCell(int N, List<Integer> Edge){
        //initializing temp with 0
        int[] temp = new int[N];

        //traversing the edge array
        for (int i = 0; i < N; i++) {
            // checking if the value is not equal to -1
            if (Edge.get(i) != -1){
                //adding weight to the destination cell
                temp[Edge.get(i)] += i;
            }
        }
        //getting the index with maximum value
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (temp[i] > max){
                ans = i;
                max = temp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Size of Edge
        int N = 4;
        List<Integer> Edge = Arrays.asList(2, 0, -1, 2);

        // Printing value
        System.out.println(maxWeightCell(N, Edge));
    }
}

//output: 2