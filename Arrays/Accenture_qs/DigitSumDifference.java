package Arrays.Accenture_qs;

//Int DigitSumDifference(int m, int n);
//
//Calculate and return the absolute difference between the sum of digits of
// numbers divisible by 4 and the sum of digits of numbers divisible by 7,
// in the range from ‘m’ to ‘n’ (inclusive).
//
//Note: 0 < m <= n

public class DigitSumDifference {
    public static int digitSumDifference(int m, int n){
        int sumDivisibleBy4 = 0;
        int sumDivisibleBy7 = 0;

        for (int i = m; i <= n; i++) {
            if (i%4==0){
                int num = i;
                while(num>0){
                    sumDivisibleBy4 += num%10;
                    num /= 10;
                }
            } else if (i%7==0) {
                int num = i;
                while (num > 0){
                    sumDivisibleBy7 += num%10;
                    num /= 10;
                }
            }
        }
        return Math.abs(sumDivisibleBy4 - sumDivisibleBy7);
    }

    public static void main(String[] args) {
        int m =50;
        int n=120;
        int result = digitSumDifference(m,n);
        System.out.println(result);
    }
}
