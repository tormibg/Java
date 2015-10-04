package _1;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Timespan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        BigInteger sec1 = new BigInteger("0");
        BigInteger sec2 = new BigInteger("0");
        sec1 = getSeconds(sc);
        sec2 = getSeconds(sc);
        BigInteger dif;
        dif = sec1.subtract(sec2).abs();
        //out.println(dif);
        //String divHour = padLeft(dif.divide(new BigInteger("3600")).toString(), 2).replace(' ', '0');
        String divHour = dif.divide(new BigInteger("3600")).toString();
        String divMin = padLeft(dif.mod(new BigInteger("3600")).divide(new BigInteger("60")).toString(), 2).replace(' ', '0');
        String divSec = padLeft(dif.mod(new BigInteger("3600")).mod(new BigInteger("60")).mod(new BigInteger("60")).toString(), 2).replace(' ', '0');

        out.printf("%s:%s:%s", divHour, divMin, divSec);
    }

    private static BigInteger getSeconds(Scanner sc) {

        String[] inputs = sc.nextLine().split(":");
        BigInteger sec, min, hour;
        sec = new BigInteger(inputs[2]);
        min = new BigInteger(inputs[1]);
        hour = new BigInteger(inputs[0]);
        min = min.multiply(new BigInteger("60"));
        hour = hour.multiply(new BigInteger("3600"));
        sec = sec.add(min).add(hour);
        return sec;
    }

    private static String padLeft(String s, int i) {
        return String.format("%1$" + i + "s", s);
    }
}
