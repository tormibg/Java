package _2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int div = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        List<Integer> numbers = new ArrayList<>();
        while (!(input.equals("End"))) {
            numbers.add(Integer.parseInt(input));
            input = sc.nextLine();
        }
        long sum = Integer.MIN_VALUE;
        boolean isNoSum = true;
        String strMaxSum = "";
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    int fNum = numbers.get(i);
                    int sNum = numbers.get(j);
                    int tNum = numbers.get(k);
                    long tmpSum = fNum + sNum + tNum;
                    if (tmpSum % div == 0 && tmpSum > sum) {
                        //(a + b + c) % D = 0
                        strMaxSum = String.format("(%d + %d + %d) %% %d = 0", fNum, sNum, tNum, div);
                        isNoSum = false;
                        sum = tmpSum;
                    }
                }
            }
        }
        if (isNoSum) {
            out.println("No");
        } else {
            out.println(strMaxSum);
        }
    }
}
