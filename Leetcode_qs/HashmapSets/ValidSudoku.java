package Leetcode_qs.HashmapSets;

//LC36

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean solution(char[][] board){
        //validate rows
        for (int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++){
                char item = board[i][j];
                if (item != '.' && !set.add(item)){
                    return false;
                }
            }
        }

        //validate columns
        for (int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char item = board[j][i];
                if (item != '.' && !set.add(item)){
                    return false;
                }
            }
        }

        //validate 3x3 sub-grids
        int[][] starts = {
                {0, 0}, {0, 3}, {0, 6},
                {3, 0}, {3, 3}, {3, 6},
                {6, 0}, {6, 3}, {6, 6}
        };
        for (int[] start : starts){
            Set<Character> set = new HashSet<>();
            for (int row = start[0]; row < start[0] + 3; row++){
                for (int col = start[1]; col < start[1] + 3; col++) {
                    char item = board[row][col];
                    if (item != '.' && !set.add(item)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
