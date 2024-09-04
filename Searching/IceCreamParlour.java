
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Number of flavors and the budget
        int numFlavors = scanner.nextInt();
        int budget = scanner.nextInt();
        // Array to store the costs of flavors
        int[] costs = new int[numFlavors];
        // Populate the costs array
        for (int i = 0; i < numFlavors; i++) {
            costs[i] = scanner.nextInt();
        }
        // Find the pair of flavors that add up to the budget
        findFlavors(costs, budget);
        scanner.close();
    }

    public static void findFlavors(int[] costs, int budget) {
        // HashMap to store the cost and its index
        Map<Integer, Integer> costMap = new HashMap<>();
        // Iterate through the costs array
        for (int i = 0; i < costs.length; i++) {
            int cost = costs[i];
            int complement = budget - cost;
            // Check if the complement is already in the map
            if (costMap.containsKey(complement)) {
                // Output the 1-based indices
                System.out.println((costMap.get(complement) + 1) + " " + (i + 1));
                return;
            }
            // Add the current cost and its index to the map
            costMap.put(cost, i);
        }
    }
}
