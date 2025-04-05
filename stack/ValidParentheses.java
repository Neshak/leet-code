package stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            switch(c){
                case '(': stack.push(')'); break;
                case '{': stack.push('}'); break;
                case '[': stack.push(']'); break;
                case ')': case '}': case ']':
                    if(stack.isEmpty() || stack.pop()!=null){
                        return false;
                    }
                default: return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "{}{}{}{]}";

        System.out.println(s);
        boolean result = isValid(s);
        System.out.println(result);
    }
}
