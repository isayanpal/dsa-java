package methods;

import java.util.Scanner;

 public class Sum {

    //    calling a method/function
    /*
    syntax

    return_type name(){
        //body
        return statement
    }
    */
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("enter num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("Sum is : "+ sum);
        sc.close();
    }

//    calling the method using brackets after the name of method
    public static void main(String[] args) {
        sum();
    }
}
