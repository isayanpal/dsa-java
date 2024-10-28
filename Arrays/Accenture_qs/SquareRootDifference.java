package Arrays.Accenture_qs;

//Int SquareRootDifference(int m, int n);
//
//Calculate and return the difference between the sum of square roots of even
// numbers and the sum of square roots of odd numbers in the range from ‘m’
// to ‘n’ (inclusive).
//
//Note: 0 < m <= n

public class SquareRootDifference {
    public static double squareRootDifference(int m,int n){
        double evenSum = 0, oddSum = 0;

        for (int i = m; i <= n; i++) {
            double squareRoot = Math.sqrt(i);
            if (i%2==0){
                evenSum += squareRoot;
            } else {
                oddSum += squareRoot;
            }
        }
        return evenSum - oddSum;
    }

    public static void main(String[] args) {
        int m = 1,n = 10;
        double result = squareRootDifference(m,n);
        System.out.printf("%.5f\n",result);
    }
}

//output:
// 1.24054
