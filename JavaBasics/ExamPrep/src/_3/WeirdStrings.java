package _3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class WeirdStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String inputStr = sc.nextLine().replaceAll("[\\/()|\\s]+", "");
        //  out.println(inputStr);
        //out.println((int)'a'-96);
        String[] inputs = inputStr.split("\\P{Alpha}+");
        // out.println(Arrays.toString(inputs));
        long maxSum = Integer.MIN_VALUE;
        int sumPrev = getSum(inputs[0].toLowerCase());
        String firstS = "", secondS = "";
        for (int i = 1; i < inputs.length; i++) {
            int sumNext = getSum(inputs[i].toLowerCase());
            if (sumNext + sumPrev >= maxSum) {
                maxSum = sumNext + sumPrev;
                firstS = inputs[i - 1];
                secondS = inputs[i];
            }
            sumPrev = sumNext;
        }
        out.println(firstS);
        out.println(secondS);
    }

    private static int getSum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += ((int) input.charAt(i)) - 96;
        }
        //  out.println(input +" -> " + sum);
        return sum;
    }
}
