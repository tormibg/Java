package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class SumNumbersFromATextFile {
    public static void main(String[] args) {
        //String fileName1 = "src/com/company/Input1.txt";
        //String fileName1 = "src/com/company/Input2.txt";
        String fileName1 = "src/com/company/Input4.txt";

        try {
            FileReader fileReader = new FileReader(fileName1);

            Scanner scanIn = new Scanner(fileReader);
            List<Integer> integers = new ArrayList<Integer>();

            while (scanIn.hasNextInt()){
                integers.add(scanIn.nextInt());
            }

            long sum = 0;
            for (Integer integer : integers) {
                sum += integer;
            }

            out.println(sum);

        } catch (FileNotFoundException e) {
            out.println("Error");
        }
    }
}
