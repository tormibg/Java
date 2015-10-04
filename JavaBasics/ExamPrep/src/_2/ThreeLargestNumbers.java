package _2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        //Double[] numbers = new Double[n];
        BigDecimal[] numbers = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = new BigDecimal(sc.nextLine());
        }
        Arrays.sort(numbers);
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            //out.println(format.format(numbers[i]));
            out.println(numbers[i].toPlainString());
            count++;
            if (count >= 3) {
                return;
            }
        }
    }
}
