package TaskSETSMAPS;

import java.util.HashMap;
import java.util.Map;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        String word = "ballon";
        Map <Character,Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            char CharToLowerCase = Character.toLowerCase(c);

            map.put(CharToLowerCase, map.getOrDefault(CharToLowerCase, 0) + 1);

        }
        System.out.println(map);
    }
}
