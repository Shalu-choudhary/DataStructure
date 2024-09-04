
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
public class SimpleTextEditor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder text = new StringBuilder();
        Stack<Operation> operationsStack = new Stack<>();
        while (q-- > 0) {
            String[] command = br.readLine().trim().split(" ");
            int operationType = Integer.parseInt(command[0]);
            switch (operationType) {
                case 1: // Append
                    String stringToAppend = command[1];
                    // Save the state before appending
                    operationsStack.push(new Operation(1, text.toString(), ""));
                    text.append(stringToAppend);
                    break;
                case 2: // Delete
                    int numberOfCharactersToDelete = Integer.parseInt(command[1]);
                    // Save the state before deleting
                    String deletedText = text.substring(text.length() - numberOfCharactersToDelete);
                    operationsStack.push(new Operation(2, text.toString(), deletedText));
                    text.setLength(text.length() - numberOfCharactersToDelete);
                    break;
                case 3: // Print
                    int k = Integer.parseInt(command[1]);
                    System.out.println(text.charAt(k - 1));
                    break;

                case 4: // Undo
                    if (!operationsStack.isEmpty()) {
                        Operation lastOperation = operationsStack.pop();
                        if (lastOperation.type == 1) {
                            text.setLength(text.length() - (text.length() - lastOperation.previousText.length()));
                        } else if (lastOperation.type == 2) {
                            text.append(lastOperation.deletedText);
                        }
                    }
                    break;
            }
        }

        br.close();
    }

    private static class Operation {

        int type; // 1 for append, 2 for delete
        String previousText;
        String deletedText;

        Operation(int type, String previousText, String deletedText) {
            this.type = type;
            this.previousText = previousText;
            this.deletedText = deletedText;
        }
    }
}
