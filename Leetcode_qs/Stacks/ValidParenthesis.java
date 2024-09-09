package Leetcode_qs.Stacks;

//LC20

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        Map<Character,Character> hashmap = new HashMap<>();
        hashmap.put(')','(');
        hashmap.put('}','{');
        hashmap.put(']','[');

        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()){
            if (!hashmap.containsKey(c)){
                stk.push(c);
            } else {
                if (stk.isEmpty() || stk.pop() != hashmap.get(c)){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
