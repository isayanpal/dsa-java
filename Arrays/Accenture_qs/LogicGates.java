package Arrays.Accenture_qs;

//Write a Java program that simulates the behavior of basic logic gates
// (AND, OR, and XOR). The program should prompt the user to enter two binary
// inputs (0 or 1) and display the corresponding outputs for each logic gate.
// If the user enters any value other than 0 or 1, the program should print
// an error message and exit.

import java.util.Scanner;

public class LogicGates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B;

        System.out.println("enter two binary inputs (0 or 1) for A and B:");
        A = scanner.nextInt();
        B = scanner.nextInt();

        if ((A != 0 && A != 1) || (B != 0 && B != 1)){
            System.out.println("please enter only binary values (0 or 1) for A and B.");
            scanner.close();
            return;
        }

        System.out.println("AND Gate Output (A AND B): " + (A & B));
        System.out.println("OR Gate Output (A OR B): " + (A | B));
        System.out.println("XOR Gate Output (A XOR B): " + (A ^ B));

        scanner.close();
    }
}

//Output:
//enter two binary inputs (0 or 1) for A and B:
//0
//1
//AND Gate Output (A AND B): 0
//OR Gate Output (A OR B): 1
//XOR Gate Output (A XOR B): 1