package _2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AddingAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int countNumbers = Integer.parseInt(sc.nextLine());
        String[] numbers = Arrays.asList(sc.nextLine().split("\\s+")).stream().toArray(String[]::new);
        int[] intNum = new int[numbers.length];
        int i = 0;
        for (String number : numbers) {
            intNum[i] = Integer.parseInt(number);
            i++;
        }
        int count = 0;
        for (int j = 0; j < intNum.length; j++) {
            for (int k = j + 1; k < intNum.length; k++) {
                for (int l = k + 1; l < intNum.length; l++) {
                    int a = intNum[j];
                    int b = intNum[k];
                    int c = intNum[l];
                    int sum = a+b+c;
                    if (sum % 360 == 0){
                        out.printf("%d + %d + %d = %d degrees\n",a,b,c,sum);
                        count++;
                    }
                }
            }
        }
        if (count == 0){
            out.println("No");
        }
    }
}