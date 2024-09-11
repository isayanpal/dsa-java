package Leetcode_qs.Stacks;

import java.util.Stack;

public class ReversePolishNotation {
    public int solution(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                switch(token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        double division = (double) a / b;
                        stack.push(division < 0 ? (int) Math.ceil(division) : (int) Math.floor(division));
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
