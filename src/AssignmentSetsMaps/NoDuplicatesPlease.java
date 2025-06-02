package AssignmentSetsMaps;

import java.util.*;

public class NoDuplicatesPlease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> emails = new ArrayList<>();
        while (true) {
            String email = scanner.nextLine().trim();
            if (email.isEmpty()) {
                break;
            }
            emails.add(email);
        }
        List<String> u = getUniqueEmails(emails);
        System.out.println( u);
    }
    public static List<String> getUniqueEmails(List<String> emails) {
        Set<String> uniSet = new LinkedHashSet<>(emails);
        return new ArrayList<>(uniSet);
    }
}