package Binary_Search;

// https://leetcode.com/problems/find-in-mountain-array/description/
// hard

public class SearchInMountain {
    static int orderAgnosticBS(int[] arr , int target, int start, int end){
         start = 0;
         end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end){
            //find the middle element
//            int mid = (start + end) / 2; // might be possible that this may exceed the range of integer
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //condition
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                // range is in the decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // range is in increasing part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the two conditions above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when we are pointing to jus one element, that is the max one because that is what the check says
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying only one item is remaining, hence coz of the above line that is the best possible answer
        return start; // or return end as both are equal
    }
    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        // search in first half
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        // search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,3,1};
//        int target = 3;
//        int ans = search(arr, target);
//        System.out.println(ans);
//    }
}
