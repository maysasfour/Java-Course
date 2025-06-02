package AssignmentSetsMaps;

import java.util.*;

public class CheckIfTwoListsHaveCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s1 = scanner.nextLine().trim().split("\\s+");
        int[] s = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

        String[] d1 = scanner.nextLine().trim().split("\\s+");
        int[] d = Arrays.stream(d1).mapToInt(Integer::parseInt).toArray();

        Set<Integer> setS = new HashSet<>();
        for (int num : s) setS.add(num);

        List<Integer> common = new ArrayList<>();
        Set<Integer> added = new HashSet<>();
        for (int num : d) {
            if (setS.contains(num) && !added.contains(num)) {
                common.add(num);
                added.add(num);
            }
        }
        if (common.isEmpty()) {
            System.out.println("No common elements");
        } else {
            for (int num : common) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
