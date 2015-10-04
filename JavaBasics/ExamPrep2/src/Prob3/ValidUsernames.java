package Prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] inputs = sc.nextLine().split("[\\s/\\\\()]+");
        // out.println(Arrays.toString(inputs));

        List<String> usernames = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z][\\w_]{2,25}\\b");
        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                usernames.add(input);
            }
        }
        int maxLenght = 0;
        String fWord = "";
        String sWord = "";
        for (int i = 0; i < usernames.size() - 1; i++) {
            int fSize = usernames.get(i).length();
            int sSize = usernames.get(i + 1).length();
            int tmpSumLenght = fSize + sSize;
            if (maxLenght < tmpSumLenght) {
                maxLenght = tmpSumLenght;
                fWord = usernames.get(i);
                sWord = usernames.get(i + 1);
            }
        }
        out.println(fWord);
        out.println(sWord);
    }
}
