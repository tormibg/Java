package Prob1;

import java.util.Arrays;
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
        int prevNumber = numbers[0];
        for (int i = 0; i < n; i++) {
            String prevString = new StringBuilder(Integer.toString(prevNumber)).reverse().toString();
            int nextNumber = numbers[i];
            if (prevString.equals(Integer.toString(nextNumber))){
                out.printf("%s<!>%s", prevNumber, nextNumber);
            }
            prevNumber = nextNumber;
        }
    }
}
