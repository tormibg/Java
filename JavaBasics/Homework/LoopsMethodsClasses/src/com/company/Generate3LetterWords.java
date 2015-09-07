package com.company;

import java.util.Scanner;

public class Generate3LetterWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] inputChars = input.nextLine().toCharArray();
        for (char firstChar : inputChars) {
            for (char secondChar : inputChars) {
                for (char thirdChar : inputChars) {
                    System.out.print(""+firstChar+secondChar+thirdChar+" ");
                }
            }
        }
    }
}
