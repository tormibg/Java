import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] text1 = Arrays.asList(scanIn.nextLine().split("\\s+")).stream().toArray(String[]::new);
        String[] text2 = Arrays.asList(scanIn.nextLine().split("\\s+")).stream().toArray(String[]::new);

        List<Character> l1 = new ArrayList<Character>();
        List<Character> l2 = new ArrayList<Character>();

        for (String s : text1) {
            l1.add(s.charAt(0));
        }
        for (String s : text2) {
            l2.add(s.charAt(0));
        }

        l2.removeAll(l1);
        l1.addAll(l2);

        for (Character character : l1) {
            out.print(character+" ");
        }
    }
}
