package Patterns;

public class Pattern19 {
    static void pattern(int n){

        //first upper half of the pattern
        //initial spaces
        int space = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < space ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }

        //lower half of the pattern
        // initial spaces
        int iSpace = 2*n-2;
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < iSpace ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iSpace-=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
