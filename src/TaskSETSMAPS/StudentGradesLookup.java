package TaskSETSMAPS;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesLookup {
    public static void main(String[] args) {
        Map<String,Integer> namesGrades= new HashMap<>();
        namesGrades.put("Sara",89);
        namesGrades.put("Mays",97);
        namesGrades.put("Mohammed",87);
        namesGrades.put("Ahmed",91);
        int s= namesGrades.get("Sara");
        System.out.println("The grade for a student called sara is :"+s);
    }



    }

