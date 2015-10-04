package Prob1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isNotMM = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prevNumber = numbers[i];
                int nextNumber = numbers[j];
                if (prevNumber != nextNumber) {
                    String prevString = new StringBuilder(Integer.toString(prevNumber)).reverse().toString();
                    if (prevString.equals(Integer.toString(nextNumber))) {
                        out.printf("%s<!>%s\n", prevNumber, nextNumber);
                        isNotMM = false;
                    }
                }
            }
        }
        if (isNotMM){
            out.println("No");
        }
    }
}
