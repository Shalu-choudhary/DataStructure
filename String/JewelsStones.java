public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                if (stone == jewels.charAt(j)) {
                    count++;
                    break; // No need to check further if we found a match
                }
            }}
        return count;
    }
    public static void main(String[] args) {
        JewelsStones js = new JewelsStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = js.numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result); // Output: 3
    }
}