
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> contactMap = new HashMap<>();
        int q = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        while (q-- > 0) {
            String command = scanner.next();
            if (command.equals("add")) {
                String contact = scanner.next();
                contactMap.put(contact, contactMap.getOrDefault(contact, 0) + 1);
            } else if (command.equals("find")) {
                String prefix = scanner.next();
                int count = 0;
                for (String key : contactMap.keySet()) {
                    if (key.startsWith(prefix)) {
                        count += contactMap.get(key);
                    }
                }
                System.out.println(count);
            }
        }

        scanner.close();  // Close the scanner
    }
}
