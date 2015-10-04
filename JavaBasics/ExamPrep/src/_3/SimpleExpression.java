package _3;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String inputStr = sc.nextLine().replaceAll("\\s+", "");
        String[] inputNum = inputStr.split("[\\+\\-]");
        String[] inputSym = inputStr.split("[0-9.]+");
        // out.println(Arrays.toString(inputNum));
        //out.println(Arrays.toString(inputSym));
        BigDecimal sum = new BigDecimal(inputNum[0]);
        for (int i = 1, j = 0; i < inputNum.length; i++, j++) {
            if (inputSym[j].isEmpty()) {
                j++;
            }
            char sign = inputSym[j].charAt(0);
            if (sign == '+') {
                sum = sum.add(new BigDecimal(inputNum[i]));
            } else {
                sum = sum.add(new BigDecimal("-" + inputNum[i]));
            }

        }
        System.out.printf(sum.toString());
    }
}
