package TaskSETSMAPS;

import java.util.HashMap;
import java.util.Map;

public class SimpleWordCounter {
    public static void main(String[] args) {
        String sentence = "coding is fun and coding is creative";
        String[] words = sentence.split(" ");
        Map <String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
