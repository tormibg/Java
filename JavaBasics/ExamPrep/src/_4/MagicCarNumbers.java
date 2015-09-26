package _4;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MagicCarNumbers {
    public static void main(String[] args) {
        HashSet<String> magicNumbers = new HashSet<>();
        char[] chars = {'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X'};
        Scanner sc = new Scanner(in);
        int magicNumber = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int n = 0; n <= 9; n++) {
                                //"CAaaaaXY", "CAabbbXY", "CAaaabXY", "CAaabbXY", "CAababXY" and "CAabbaXY"
                                //"i j k l M N"
                                if ((i == j && i == k) ||
                                        j == k && j == l ||
                                        i == j && k == l ||
                                        i == k && j == l ||
                                        i == l && j == k) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i);
                                    sb.append(j);
                                    sb.append(k);
                                    sb.append(l);
                                    sb.append(chars[m]);
                                    sb.append(chars[n]);
                                    if (GetMagicNumber(sb.toString()) == magicNumber) {
                                        magicNumbers.add(sb.toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
       // out.println(magicNumbers.toString());
        out.println(magicNumbers.size());

    }

    private static int GetMagicNumber(String s) {
        int weight = 30 + 10; //CA
        for (int i = 0; i < s.length(); i++) {
            //'A'  10, 'B'  20, 'C'  30, 'E'  50, 'H'  80, 'K'  110, 'M'  130, 'P'  160, 'T'  200, 'X'  240
            switch (s.charAt(i)) {
                case 'A':
                    weight += 10;
                    break;
                case 'B':
                    weight += 20;
                    break;
                case 'C':
                    weight += 30;
                    break;
                case 'E':
                    weight += 50;
                    break;
                case 'H':
                    weight += 80;
                    break;
                case 'K':
                    weight += 110;
                    break;
                case 'M':
                    weight += 130;
                    break;
                case 'P':
                    weight += 160;
                    break;
                case 'T':
                    weight += 200;
                    break;
                case 'X':
                    weight += 240;
                    break;
                default:
                    weight += Integer.parseInt(String.valueOf(s.charAt(i)));
                    break;
            }
        }
        return weight;
    }
}
