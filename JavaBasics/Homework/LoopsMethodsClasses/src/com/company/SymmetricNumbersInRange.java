package com.company;

import java.util.Scanner;

public class SymmetricNumbersInRange {

    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        int firstNum = inputStr.nextInt();
        int secondNum = inputStr.nextInt();
        System.out.print("Symmetric  : ");
        for (int i = firstNum; i <= secondNum; i++) {
            if (checkSymmetric(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Palindrome : ");
        for (int i = firstNum; i <= secondNum; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkSymmetric(int i) {
        Boolean result = false;
        String reversNum = new StringBuilder(Integer.toString(i)).reverse().toString();
        if (Integer.toString(i).equals(reversNum)) {
            result = true;
        }
        return result;
    }

    public static boolean isPalindrome(long number) {

        if (number == 0) return true;
        else if (number < 0) return false;
        long DEG_10 = (long) (Math.pow(10, (int) Math.log10(number)));

        while (number > 0) {
            long dStart = number / DEG_10;
            long dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * DEG_10 - dEnd) / 10;
            DEG_10 /= 100;
        }

        return true;
    }
}
