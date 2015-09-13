import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\P{Alpha}+")).stream().toArray(String[]::new);
//        for (String s : arrStr) {
//            out.println(s);
//        }
        out.print(arrStr.length);
    }
}
