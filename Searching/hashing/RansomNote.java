
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create an array to count frequency of each character in the magazine
        int[] charCount = new int[26];
        // Fill the array with the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Check if each character in the ransom note can be matched with the magazine
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }// Not enough characters in magazine
            charCount[c - 'a']--; // Use the character
        }
        return true; // All characters can be matched
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: false

        ransomNote = "aa";
        magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: false

        ransomNote = "aa";
        magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: true
    }
}
