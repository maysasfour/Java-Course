package AssignmentSetsMaps;

import java.util.*;

public class UsernameAvailabilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Lina"));
        Set<String> uniqueNames = new HashSet<>(names);

        String username = scanner.nextLine();

        if (uniqueNames.contains(username)) {
            System.out.println(username + " > Username already taken");
        } else {
            names.add(username);
            uniqueNames.add(username);
            System.out.println(username + " >  Available Usernames " + names);
        }

    }
}
