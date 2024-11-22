import java.util.*;

public class WordUtils {
    public Set<String> getUniqueWords(List<String> words) {
        return new HashSet<>(words);
    }

    public Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> countWordMap = new HashMap<>();

        for (String word : words) {
            countWordMap.put(word, countWordMap.getOrDefault(word, 0) + 1);
        }

        return countWordMap;
    }
}
