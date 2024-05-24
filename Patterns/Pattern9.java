package Patterns;

public class Pattern9 {
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
    }
}
