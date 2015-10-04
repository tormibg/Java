package _3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LongestOddEvenSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String inputStr = sc.nextLine().replaceAll("[( ]+", "");
        //out.println(inputStr);
        String[] numbers = inputStr.split("[)]+");
        //out.println(Arrays.toString(numbers));
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        boolean firstBeEven = isEven(intNumbers[0]);
        int maxCount = 0;
        int tmpCount = 0;
        for (int intNumber : intNumbers) {
            Boolean secondBeEven = isEven(intNumber);
            if (firstBeEven == secondBeEven || intNumber == 0) {
                tmpCount++;
            } else {
                firstBeEven = secondBeEven;
                tmpCount = 1;
            }
            firstBeEven = !firstBeEven;
            if (tmpCount > maxCount) {
                maxCount = tmpCount;
            }
        }
        out.println(maxCount);
    }

    private static Boolean isEven(int intNumber) {
        if (intNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
