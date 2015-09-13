import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\P{Alpha}+")).stream().toArray(String[]::new);
        String wordForSeek = scanIn.next();
        int count = 0;
        for (String s : arrStr) {
            if (s.equalsIgnoreCase(wordForSeek)){
                count++;
            }
        }
        out.print(count);
    }
}
