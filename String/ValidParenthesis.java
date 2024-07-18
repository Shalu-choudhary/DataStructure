public class ValidParenthesis {

    public static boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            
            // If balance goes negative, it means ')' appeared before '('
            if (balance < 0) {
                return false;
            }
        }
        // If balance is not zero, there are unmatched '('
        return balance == 0;
    }
    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "([)]";
        String str3 = "{[]}";

        System.out.println(str1 + " is valid: " + isValid(str1));
        System.out.println(str2 + " is valid: " + isValid(str2));
        System.out.println(str3 + " is valid: " + isValid(str3));
    }
}
