import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\P{Alpha}+")).stream().toArray(String[]::new);
        Set<String> uniqWords = new LinkedHashSet<>();
        for (String s : arrStr) {
            uniqWords.add(s.toLowerCase());
        }
        for (String uniqWord : uniqWords) {
            out.print(uniqWord+" ");
        }
    }
}
