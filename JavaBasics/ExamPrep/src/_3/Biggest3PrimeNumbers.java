package _3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Biggest3PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //String str = sc.nextLine().replaceAll("\\s+", "");
        //str = str.substring(1, str.length() - 1);
        //String[] strNum = str.split("\\)\\(");
        String[] strNum = sc.nextLine().split("[() ]+");
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < strNum.length; i++) {
            if (strNum[i].equals("")) {
                numbers.add(0);
            } else {
                numbers.add(Integer.parseInt(strNum[i]));
            }
        }
        ArrayList<Integer> intList = new ArrayList<>();

        for (Integer number : numbers) {
            if (isPrime(Math.abs(number))) {
                intList.add(number);
            }
        }

        if (intList.size() >= 3) {
            int sum = 0;
            Collections.sort(intList);
            for (int i = intList.size() - 1; i >= intList.size() - 3; i--) {
                sum += intList.get(i);
            }
            out.println(sum);
        } else {
            out.println("No");
        }
        //out.println(Arrays.toString(numbers));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
