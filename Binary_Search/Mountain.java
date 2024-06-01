package Binary_Search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//easy

//https://leetcode.com/problems/find-peak-element/description/
//medium

public class Mountain {
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
}
