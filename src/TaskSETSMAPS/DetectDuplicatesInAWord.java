package TaskSETSMAPS;

import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesInAWord {
    public static void main(String[] args) {
String [] w ={"Mays","Mohammed","Sameer","Reem","Tamer"};
for (String word : w)
{
    if(hasDuplicates(word))
    {
        System.out.println(word + "= Has Repeated letters");
    }
    else {
        System.out.println(word + "= No Repeated letters");
    }
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

