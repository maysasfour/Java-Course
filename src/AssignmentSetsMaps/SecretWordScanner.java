package AssignmentSetsMaps;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecretWordScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            System.out.println(hasDuplicates(word));
        }
    }

    public static boolean hasDuplicates(String word) {
        Set<Character> set = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (set.contains(c)) {
                return true;
            }
            set.add(c);
        }
        return false;
    }
}
