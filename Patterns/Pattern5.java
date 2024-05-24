package Patterns;

public class Pattern5 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
