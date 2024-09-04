package Leetcode_qs.ArraysStrings;

//LC56

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution(intervals)));
    }
    public static int[][] solution(int[][] intervals){
        if (intervals.length == 0) return new int[0][0];

        //sort the intervals based on the starting time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals){
            //if merged list is empty or there is no overlap
            if( merged.isEmpty() || merged.get(merged.size() -1)[1] < interval[0]){
                merged.add(interval);
            } else {
                // there is overlap , merge the intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size()- 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
