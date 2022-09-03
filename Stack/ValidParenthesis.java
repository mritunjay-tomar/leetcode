package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        int n = s.length();
        Stack<String> stack = new Stack();

        for(int i=0;i<n;i++) {
            if((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                stack.push(Character.toString(s.charAt(i)));
            }
            try {
                if(s.charAt(i) == ')') {
                    String closing = stack.pop();
                    if (!closing.equals("(")) {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    String closing = stack.pop();
                    if (!closing.equals("[")) {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    String closing = stack.pop();
                    if (!closing.equals("{")) {
                        return false;
                    }
                }
            }
            catch(Exception e) {
                return false;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("(]"));
    }

}
