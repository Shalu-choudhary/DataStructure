import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatcher {
    public static void main(String[] args) {
        List<String> words = List.of("CamelCase", "Camel", "Case", "CamelCaseMatcher", "CaseCamel");
        String query = "CCM";
        
        List<String> matchingWords = findMatchingWords(words, query);
        
        System.out.println("Matching words: " + matchingWords);
    }

    public static List<String> findMatchingWords(List<String> words, String query) {
        List<String> result = new ArrayList<>();
        String regex = buildRegexFromQuery(query);
        
        for (String word : words) {
            if (word.matches(regex)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private static String buildRegexFromQuery(String query) {
        StringBuilder regex = new StringBuilder();
        regex.append(".*");
        
        for (char c : query.toCharArray()) {
            regex.append(c);
            regex.append("[a-z]*");
        }
        
        regex.append(".*");
        return regex.toString();
    }
}
