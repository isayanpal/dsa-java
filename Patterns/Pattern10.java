package Patterns;

public class Pattern10 {
    static void pattern(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i > n) stars = 2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
