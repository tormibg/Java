package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DozenOfEggs {

    public static final int WEEK_DAYS = 7;
    public static final int DOZEN = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int eggs = 0;
        int dozens = 0;
        for (int i = 0; i < WEEK_DAYS; i++) {
            String[] inputStr = sc.nextLine().split("\\s+");
            if (inputStr[1].contains("eggs")) {
                eggs += Integer.parseInt(inputStr[0]);
            } else {
                dozens += Integer.parseInt(inputStr[0]);
            }
        }
        int eggsForPrint = eggs % DOZEN;
        dozens += eggs / DOZEN;
        out.printf("%d dozens + %d eggs",dozens,eggsForPrint);
    }
}
