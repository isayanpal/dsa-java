package Linear_Search;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {16,92,46,78,45,69};
        int target = 45;
        System.out.println(linear_search(arr,target,1,4));
    }
    static int linear_search(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index=start; index <= end; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
