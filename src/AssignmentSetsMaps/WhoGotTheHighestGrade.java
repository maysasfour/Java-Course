package AssignmentSetsMaps;

import java.util.HashMap;
import java.util.Map;

public class WhoGotTheHighestGrade {
    public static void main(String[] args) {

        Map<String,Integer> namesGrades= new HashMap<>();
        namesGrades.put("Ali",88);
        namesGrades.put("Lina",93);
        namesGrades.put("Zain",79);
        String topStudent = null;
        int highestGrade = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : namesGrades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println(topStudent);
    }
}
