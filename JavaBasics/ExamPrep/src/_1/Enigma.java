package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());

        String[] lines = new String[n];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = sc.nextLine();
        }

        int koef;

        for (int i = 0; i < lines.length; i++) {

            koef = lines[i].replaceAll("[\\s\\d]+", "").length() / 2;

            for (int j = 0; j < lines[i].length(); j++) {
                char currChar = lines[i].charAt(j);
                if ((currChar >= '0' && currChar <= '9') || currChar == ' ') {
                    out.print(currChar);
                    continue;
                }
                char c = (char) (currChar + koef);
                out.print(c);
            }
            out.println();
        }
    }
}