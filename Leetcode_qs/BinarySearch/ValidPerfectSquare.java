package Leetcode_qs.BinarySearch;

//LC367

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num){
        int l=1;
        int r=num;

        while (l<=r){
            int m = (l+r)/2;
            long m_square = (long)m*m;

            if (num==m_square){
                return true;
            } else if (m_square < num) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return false;
    }
}
