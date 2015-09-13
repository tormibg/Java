import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\s+")).stream().toArray(String[]::new);
        String tmpStr = arrStr[0];
        for (String s : arrStr) {
            if (!s.equals(tmpStr)){
                out.println();
            }
            out.print(s+" ");
            tmpStr = s;
        }
    }
}
