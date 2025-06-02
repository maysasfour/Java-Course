package TaskSETSMAPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesCollecter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Lina", "Ali", "Zain");

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
