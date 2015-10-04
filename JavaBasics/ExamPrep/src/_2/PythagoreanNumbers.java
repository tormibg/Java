package _2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isPythagorNumbers = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = numbers[i];
                int b = numbers[j];
                if (a <= b) {
                    for (int k = 0; k < n; k++) {
                        int c = numbers[k];
                        if (a * a + b * b == c * c) {
                            out.printf("%d*%d + %d*%d = %d*%d\n", a, a, b, b, c, c);
                            isPythagorNumbers = true;
                        }
                    }
                }
            }
        }
        if (!(isPythagorNumbers)) {
            out.println("No");
        }
    }
}
