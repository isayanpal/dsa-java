package Linear_Search;

public class Main {
    public static void main(String[] args) {
        int[] list = {23,45,6,9,19,-5,-13,29};
        int target = 29;
        int result = linear_search(list, target);
        System.out.println("Target found at index =" + " " + result);
    }
//    search in the array: return the index if item found
//    otherwise if item not found return -1

    static int linear_search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index=0; index < arr.length; index++){
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