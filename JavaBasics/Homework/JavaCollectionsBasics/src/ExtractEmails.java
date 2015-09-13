import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String inputText = scanIn.nextLine();

        String emailRegEx = "([a-z0-9][a-z0-9-._]*[a-z0-9])@([a-z0-9][a-z0-9-]*[a-z0-9.])+[a-z0-9]+";
        Pattern pattern = Pattern.compile(emailRegEx);
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()){
            out.println(matcher.group());
        }
    }
}
