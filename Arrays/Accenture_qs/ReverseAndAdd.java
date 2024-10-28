package Arrays.Accenture_qs;

//Int ReverseAndAdd(int m, int n);
//
//Calculate and return the sum of numbers obtained by reversing the digits of
// each number in the range from ‘m’ to ‘n’ (inclusive).
//
//Note: 0 < m <= n

public class ReverseAndAdd {
    public static int reverseAndAdd(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            int reversedNum = 0;
            int temp = i;
            while (temp > 0) {
                reversedNum = reversedNum * 10 + temp % 10;
                temp /= 10;
            }
            sum += reversedNum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int m = 21;
        int n = 35;
        int result = reverseAndAdd(m, n);
        System.out.println(result);
    }
}
