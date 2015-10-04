package _1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;
import static java.lang.System.out;

public class CognateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine().replaceAll("\\P{Alpha}", " ").trim();
        String[] inputs = input.split("\\s+");
        Set<String> strings = new LinkedHashSet<>();
        //out.println(Arrays.toString(inputs));
        if (inputs.length >= 3) {
            for (String word1 : inputs) {
                for (String word2 : inputs) {
                    for (String word3 : inputs) {
                        if ((word1 + word2).equals(word3)) {
                            strings.add(String.format("%s|%s=%s\n", word1, word2, word3));
                        }
                    }
                }
            }
        }
        if (strings.size() > 0) {
            for (String string : strings) {
                out.print(string);
            }
        } else {
            out.print("No");
        }
    }
}
