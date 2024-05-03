package methods;

public class Shadowing {
    static int x=69; //this will be shadowed at line 10
    static void random(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println(x); // 69
        int x=96;
        System.out.println(x); //96
        random();
    }
}
