package _2;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        BigInteger t1 = sc.nextBigInteger();
        BigInteger t2 = sc.nextBigInteger();
        BigInteger t3 = sc.nextBigInteger();
        int tNumbers = sc.nextInt();
        BigInteger t4;
        for (int i = 4; i <= tNumbers; i++) {
            t4 = t1;
            t1 = t2;
            t2 = t3;
            t3 = t4.add(t1).add(t2);
        }
        if (tNumbers == 1){
            out.println(t1);
        } else if (tNumbers == 2){
            out.println(t2);
        } else {
            out.println(t3);
        }
    }
}
