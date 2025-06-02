package TaskSETSMAPS;

import java.util.HashMap;
import java.util.Map;

public class AreTheseAnagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("from", "form"));
        System.out.println(areAnagrams("three", "there"));
        System.out.println(areAnagrams("melon", "lemon"));
        System.out.println(areAnagrams("hat", "bat"));
        System.out.println(areAnagrams("Mays", "Meet"));
    }

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> Map = new HashMap<>();

        for (char c : a.toCharArray()) {
            Map.put(c, Map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!Map.containsKey(c)) {
                return false;
            }
           Map.put(c, Map.get(c) - 1);

            if (Map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    }

