package md.utm.marcel.lab4;

import java.util.EmptyStackException;
import java.util.Stack;

public class Parenthesis {
    public static boolean check(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character c = expression.charAt(i);

            try {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}