package Leetcode_qs.BinarySearch;

//LC278

public class FirstBadVersion {

    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n){
        if (n==1) return n;

        int start = 1;
        int end = n;
        int badVersion = 1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (isBadVersion(mid)){
                badVersion = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return badVersion;
    }

}
