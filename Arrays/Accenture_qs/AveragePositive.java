package Arrays.Accenture_qs;

//Given an array of integers, find the average of all positive numbers in the array.

public class AveragePositive {
    public static float averagePositive(int[] arr){
        int sum = 0, count = 0;
        for (int num:arr) {
            if(num>0){
                sum+=num;
                count++;
            }
        }
        return (count>0)? (float)sum/count : -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,-4,1,3};
        float result = averagePositive(arr);
        System.out.println("Output: "+result);
    }
}
