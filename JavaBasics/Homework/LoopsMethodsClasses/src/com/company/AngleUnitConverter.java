package com.company;
//Radians = Degrees * Pi / 180
//Degrees = Radian * 180 / Pi

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        int countInputs = Integer.parseInt(scanIn.nextLine());
        for (int i = 0; i < countInputs; i++){
            String inputStr = scanIn.nextLine();
            //String[] arrStr = Arrays.asList(inputStr.split("\\s+")).toArray(new String[Arrays.asList(inputStr.split("\\s+")).size()]);
            String[] arrStr = Arrays.asList(inputStr.split("\\s+")).stream().toArray(String[]::new);
            if (arrStr[1].equals("deg")){
                out.printf("%.6f rad\n", DegreesToRadians(Double.parseDouble(arrStr[0])));
            }
            else{
                out.printf("%.6f deg\n", RadiansToDegrees(Double.parseDouble(arrStr[0])));
            }
        }
    }

    private static double RadiansToDegrees(Double i) {
        return i * 180 / Math.PI;
    }

    private static double DegreesToRadians(Double i) {
        return i * Math.PI / 180;
    }
}
