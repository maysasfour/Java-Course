package AssignmentSetsMaps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordLengthsDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        Map<String, Integer> wordLength= new LinkedHashMap<>();

        for (String word : words) {
            wordLength.put(word, word.length());
        }

        System.out.println(wordLength);

    }
}

