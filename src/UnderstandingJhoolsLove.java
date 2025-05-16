import java.util.Scanner;

public class UnderstandingJhoolsLove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String s1 = "love";

        int s2 = 0;

        for (int i =0 ; i <s.length() && s2 < s1.length();i++)
        {
            if (s.charAt(i) == s1.charAt(s2))
            {
                s2++;
            }
        }
        if (s2 == s1.length())
        {
            System.out.println("I love you, too!");
        }
        else
        {
            System.out.println("Let us breakup!");
        }
    }
}
