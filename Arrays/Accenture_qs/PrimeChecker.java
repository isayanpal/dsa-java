package Arrays.Accenture_qs;

//Write a Java program to determine whether a given integer is a prime number
// or composite number. If the number is less than or equal to 1, print that
// it is "neither prime nor composite." Use a helper method to check if the
// number is prime.

import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 1){
            System.out.println(num + "is neither prime nor composite.");
        } else if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + "is a composite number");
        }

        scanner.close();
    }
}

//Output:
//Enter a number: 15
//15is a composite number