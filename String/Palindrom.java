public class Palindrom {
        public static void main(String[] args) {
            String a = "abdef";
            String b = "fecab";
            boolean result = canFormPalindrome(a, b);
            System.out.println("Can form palindrome: " + result);
        }
        public static boolean canFormPalindrome(String a, String b) {
            return check(a, b) || check(b, a);
        }
        private static boolean check(String a, String b) {
            int n = a.length();
            for (int i = 0; i <= n; i++) {
                String prefixA = a.substring(0, i);
                String suffixB = b.substring(i);
                if (isPalindrome(prefixA + suffixB)) {
                    return true;
                }
            }
            return false;
        }
        private static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

