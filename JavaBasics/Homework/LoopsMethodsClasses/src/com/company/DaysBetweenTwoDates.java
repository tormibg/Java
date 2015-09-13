package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateStartString = String.format(padLeft(scanIn.nextLine(), 10)).replace(" ", "0");
        String dateEndString = String.format(padLeft(scanIn.nextLine(), 10)).replace(" ", "0");


        LocalDate startDate = LocalDate.parse(dateStartString, formatter);
        LocalDate endDate = LocalDate.parse(dateEndString, formatter);

        //out.println(formatter.format(startDate));
        //out.println(endDate);

        // Period dont work if days more that 27 days !!
        //long days = Period.between(startDate, endDate).getDays();

        long days1 = ChronoUnit.DAYS.between(startDate,endDate);

        //out.println(days);
        out.println(days1);


        scanIn.close();

    }

    private static String padLeft(String s, int i) {
        return String.format("%1$" + i + "s", s);
    }
}