import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\s+")).stream().toArray(String[]::new);
        String tmpStr = arrStr[0];
        String maxStrElement = tmpStr;
        int maxLength = 0;
        int tmpLength = 0;
        for (String s : arrStr) {
            if (s.equals(tmpStr)){
                tmpLength ++;
            }else{
                if (tmpLength > maxLength) {
                    maxStrElement = tmpStr;
                    maxLength = tmpLength;
                }
                tmpLength = 1;
            }
            tmpStr = s;
        }
        if (tmpLength > maxLength) {
            maxStrElement = tmpStr;
            maxLength = tmpLength;
        }
        for (String s : arrStr) {
            if (s.equals(maxStrElement)){
                out.print(s+" ");
            }
        }
    }
}
