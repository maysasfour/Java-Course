package AssignmentSetsMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CityVisitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String s = scanner.nextLine();
        String[] cities = s.split("\\s+");

        for (String city : cities) {
            map.put(city, map.getOrDefault(city, 0) + 1);
        }

        System.out.println(map);
    }

}
