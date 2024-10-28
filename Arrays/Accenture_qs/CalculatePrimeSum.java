package Arrays.Accenture_qs;

//Int CalculatePrimeSum(int m, int n);
//
//Calculate and return the sum of prime numbers between ‘m’ and ‘n’ (inclusive).
//
//Note: 0 < m <= n

public class CalculatePrimeSum {
    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    static int calculatePrimeSum(int m, int n){
        int sum = 0;
        for (int i = m;i<=n;i++){
            if (isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int m =10,n=50;
        int result = calculatePrimeSum(m,n);
        System.out.println(result);
    }
}
