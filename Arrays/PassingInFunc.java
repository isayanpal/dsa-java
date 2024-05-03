package Arrays;
import java.util.Arrays;
public class PassingInFunc {
    static void change(int arr[]){
        arr[2]=66;
    }
    public static void main(String[] args) {
        int[] nums = {3,7,8,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
