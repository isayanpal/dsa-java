package Arrays.Accenture_qs;

//Given an integer array and an integer element, check if the array
// contains the element.

public class ArrayContainsElement {
    public static boolean containsElement(int[] arr,int element){
        for (int num: arr){
            if(num == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        int element = 2;
        boolean result = containsElement(arr,element);
        System.out.println(result? "True" : "False");
    }
}
