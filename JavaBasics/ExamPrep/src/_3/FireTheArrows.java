package _3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class FireTheArrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());

        char[][] ma3x = new char[n][];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            //ma3x[i] = new char[line.length()];
            ma3x[i] = line.toCharArray();
        }
        boolean hasMoved = true;
        while (hasMoved) {
            hasMoved = false;

            for (int row = 0; row < ma3x.length; row++) {

                for (int col = 0; col < ma3x[row].length; col++) {
                    if (ma3x[row][col] == '>') {
                        if (col + 1 <= ma3x[row].length - 1 && ma3x[row][col + 1] == 'o') {
                            ma3x[row][col] = 'o';
                            ma3x[row][col + 1] = '>';
                            hasMoved = true;
                        }
                    } else if (ma3x[row][col] == '<') {
                        if (col - 1 >= 0 && ma3x[row][col - 1] == 'o') {
                            ma3x[row][col] = 'o';
                            ma3x[row][col - 1] = '<';
                            hasMoved = true;
                        }
                    } else if (ma3x[row][col] == '^') {
                        if (row - 1 >= 0 && ma3x[row - 1][col] == 'o') {
                            ma3x[row][col] = 'o';
                            ma3x[row - 1][col] = '^';
                            hasMoved = true;
                        }
                    } else if (ma3x[row][col] == 'v') {
                        if (row + 1 <= ma3x.length - 1 && ma3x[row + 1][col] == 'o') {
                            ma3x[row][col] = 'o';
                            ma3x[row + 1][col] = 'v';
                            hasMoved = true;
                        }
                    }
                }
            }
        }
        for (char[] chars : ma3x) {
            for (char aChar : chars) {
                out.print(aChar);
            }
            out.println();
        }
    }
}
