import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        //String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\P{Alpha}+")).stream().toArray(String[]::new);
        String inputTxt = scanIn.nextLine().toLowerCase();
        String subStrForSeek = scanIn.next().toLowerCase();
        int count = 0;
        String regEx = "(?=("+subStrForSeek+"))."; //regex with overlapping
        Pattern wordPattern = Pattern.compile(regEx);
        Matcher matcher = wordPattern.matcher(inputTxt);
        while (matcher.find()){
            //out.println(matcher.group().toString());
            count++;
        }
        out.print("\n"+count);
    }
}
