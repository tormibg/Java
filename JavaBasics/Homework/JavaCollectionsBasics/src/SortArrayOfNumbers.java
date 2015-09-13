import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        int intNumbers = scanIn.nextInt();
        int[] arrInt = new int[intNumbers];
        for (int i = 0; i < intNumbers; i++){
            arrInt[i] = scanIn.nextInt();
        }
        Arrays.sort(arrInt);
        for (int i : arrInt) {
            out.print(i + " ");
        }
    }
}
