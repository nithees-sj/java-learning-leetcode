import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // For closing brackets
            else {
                if (stack.isEmpty()) return false; // nothing to match
                char top = stack.pop();

                // Check for valid pair
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
