
import java.util.Stack;

public class BalanceBracket {

    public static void main(String[] args) {
        String[] inputs = {
            "{[()]}",
            "{[(])}",
            "{{[[(())]]}}"
        };

        for (String input : inputs) {
            System.out.println(isBalanced(input) ? "YES" : "NO");
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                default:
                    // Invalid character (if required to handle)
                    return false;
            }
        }

        // If stack is empty, all opening brackets were matched
        return stack.isEmpty();
    }
}
