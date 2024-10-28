package Arrays.Accenture_qs;

//Given an integer array and an integer element, count the number of
// occurrences of the element in the array.

public class OccurrenceCounter {
    public static int countOccurrences(int[] arr, int element){
        int count = 0;

        for(int num:arr){
            if(num == element){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,2};
        int element = 2;

        int result = countOccurrences(arr, element);
        System.out.println(result);
    }
}
