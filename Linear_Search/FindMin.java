package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] list = {23,45,6,9,19,-5,-13,29};
        System.out.println(min(list));
    }
    static int min(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < result){
                result = arr[i];
            }
        }
        return result;
    }
}
