package Arrays.Accenture_qs;

//Int FibonacciSum(int m, int n);
//
//Calculate and return the sum of Fibonacci numbers in the range from ‘m’ to
// ‘n’ (inclusive).
//
//Note: 0 < m <= n

public class FibonacciSum {
    public static int fibonacciSum(int m,int n){
        int a = 0, b=1,temp,sum=0;

        while(b<=n){
            if (b>=m){
                sum += b;
            }
            temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        int m =5,n=20;
        int result = fibonacciSum(m,n);
        System.out.println(result);
    }
}
