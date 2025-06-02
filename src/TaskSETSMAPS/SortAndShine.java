package TaskSETSMAPS;

import java.util.*;

public class SortAndShine {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(5,3,8,3,1,5);
        // Expected output: [1,3,5,8]
        Set<Integer> uniqueNumbers = new TreeSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}
