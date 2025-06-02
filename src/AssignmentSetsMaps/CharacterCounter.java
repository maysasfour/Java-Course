package AssignmentSetsMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> r = countLetters(s);
        System.out.println(r);
    }
    public static Map<Character, Integer> countLetters(String sentence) {
        Map<Character, Integer> Count = new LinkedHashMap<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                Count.put(c, Count.getOrDefault(c, 0) + 1);
            }
        }
        return Count;
    }
    }
