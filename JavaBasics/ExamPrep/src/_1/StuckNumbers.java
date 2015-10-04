package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        boolean isNo = true;
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        int firstNumber = numbers[i];
                        int secondNumber = numbers[j];
                        int thirdNumber = numbers[k];
                        int fourNumber = numbers[l];
                        if (firstNumber != secondNumber && firstNumber != thirdNumber && firstNumber != fourNumber &&
                                secondNumber != thirdNumber && secondNumber != fourNumber &&
                                thirdNumber != fourNumber) {
                            String firstStuck = "" + firstNumber + secondNumber;
                            String secondStuck = "" + thirdNumber + fourNumber;
                            if (firstStuck.equals(secondStuck)) {
                                out.printf("%d|%d==%d|%d\n", firstNumber, secondNumber, thirdNumber, fourNumber);
                                isNo = false;
                            }
                        }
                    }
                }
            }
        }
        if (isNo) {
            out.printf("No\n");
        }
    }
}
